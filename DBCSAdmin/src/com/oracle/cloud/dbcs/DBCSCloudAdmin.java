package com.oracle.cloud.dbcs;

import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.core.Response;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.WordUtils;

import com.oracle.cloud.core.OracleCloudAdmin;
import com.oracle.cloud.core.beans.CloudEnvCreationParams;
import com.oracle.cloud.core.beans.CloudEnvVICreationParams;
import com.oracle.cloud.core.beans.CloudServiceManageParams;
import com.oracle.cloud.core.beans.ManageStatus;
import com.oracle.cloud.core.beans.OCloudService;
import com.oracle.cloud.core.beans.CloudEnvVICreationParams.Keys;
import com.oracle.cloud.core.beans.CloudEnvVICreationParams.Level;
import com.oracle.cloud.dbcs.beans.DBCSEnvCreationParams;
import com.oracle.cloud.dbcs.beans.DBCSScaleUpParams;
import com.oracle.cloud.dbcs.beans.DBCSServiceInformation;
import com.oracle.cloud.dbcs.util.DBCSConstants;

import net.sf.json.JSONObject;
import net.sf.json.util.JSONBuilder;

/**
 * This class offer methods to manage Oracle Database Cloud Service environment
 * like methods to create, delete, start, stop, start, scale up DBCS Services.
 * 
 * @author eduardo.r.oliveira@oracle.com
 *
 */
public class DBCSCloudAdmin extends OracleCloudAdmin {
	private static final String S_UNDERSCORE = "_";
	private static final char UNDERSCORE = '_';
	private static final char[] UNDERSCORE_AS_CHAR_ARR = { UNDERSCORE };
	private static final String EMPTY_STRING = "";
	private static final JSONObject JSON_STOP_SERVICE = JSONObject.fromObject(DBCSConstants.DBCS_JSON_STOP_SERVICE);
	private static final JSONObject JSON_START_SERVICE = JSONObject.fromObject(DBCSConstants.DBCS_JSON_START_SERVICE);
	private static final JSONObject JSON_RESTART_SERVICE = JSONObject
			.fromObject(DBCSConstants.DBCS_JSON_RESTART_SERVICE);

	/**
	 * @param username
	 *            The Cloud user name. It is usually and email.
	 * @param password
	 *            The Cloud password.
	 * @param identityDomain
	 *            The Cloud identity domain. Usually something related to the
	 *            company name.
	 * @param instancesUrl
	 *            The instances URL. Usually
	 *            "https://dbaas.oraclecloud.com/paas/service/dbcs/api/v1.1/instances"
	 *            value.
	 */
	public DBCSCloudAdmin(String username, String password, String identityDomain, String instancesUrl) {
		super(username, password, identityDomain, instancesUrl);
	}

	/**
	 * Stops the service identified in the mngParam
	 * 
	 * @param mngParams
	 *            An instance of CloudServiceManageParams containing information
	 *            about be service to be stopped
	 * @return Returns an instance of {@link ManageStatus}, containing the
	 *         status of the execution
	 */
	@Override
	public ManageStatus stopService(CloudServiceManageParams mngParams) {
		return manageServiceState(mngParams, JSON_STOP_SERVICE);
	}

	/**
	 * Starts the service identified in the mngParam
	 * 
	 * @param mngParams
	 *            An instance of CloudServiceManageParams containing information
	 *            about be service to be started
	 * @return Returns an instance of {@link ManageStatus}, containing the
	 *         status of the execution
	 */
	@Override
	public ManageStatus startService(CloudServiceManageParams mngParams) {
		return manageServiceState(mngParams, JSON_START_SERVICE);
	}

	/**
	 * Restarts the service identified in the mngParam
	 * 
	 * @param mngParams
	 *            An instance of CloudServiceManageParams containing information
	 *            about be service to be restarted
	 * @return Returns an instance of {@link ManageStatus}, containing the
	 *         status of the execution
	 */
	@Override
	public ManageStatus restartService(CloudServiceManageParams mngParams) {
		return manageServiceState(mngParams, JSON_RESTART_SERVICE);
	}

	/**
	 * Creates a Oracle DBCS Service based on the parameters received.
	 * 
	 * @param creationParams
	 *            An instance of {@link DBCSEnvCreationParams}, containing the
	 *            data necessary to create the new DBCS Service
	 * @return Returns an instance of {@link ManageStatus} containing the
	 *         execution status
	 */
	@Override
	public ManageStatus createOracleService(CloudEnvCreationParams creationParams) {
		if (!(creationParams instanceof DBCSEnvCreationParams)) {
			throw new IllegalArgumentException("Received an instance of [" + creationParams.getClass().getName()
					+ "] but expect an instance of [" + DBCSEnvCreationParams.class.getName() + "]");
		}

		if (!creationParams.getLevel().equals(Level.PAAS)) {
			throw new IllegalArgumentException("The level must be set to [PAAS] and it was received ["
					+ creationParams.getLevel() + "]. Use the Level.PAAS constant to fix it.");
		}

		DBCSEnvCreationParams params = (DBCSEnvCreationParams) creationParams;

		Builder invocBuilder = getBaseTarget().request(CONTENT_TYPE_SERVICE_JSON);
		invocBuilder = invocBuilder.header(X_ID_TENANT_NAME, getIdentityDomain());
		invocBuilder = invocBuilder.header(CONTENT_TYPE, CONTENT_TYPE_SERVICE_JSON);

		StringWriter jsonWriter = new StringWriter();
		JSONBuilder jsnBuilder = new JSONBuilder(jsonWriter);
		jsnBuilder.object();

		putJsonIfValue(DBCSEnvCreationParams.Keys.SERVICE_NAME, params.getServiceName(), jsnBuilder);
		putJsonIfValue(DBCSEnvCreationParams.Keys.LEVEL, params.getLevel(), jsnBuilder);
		putJsonIfValue(DBCSEnvCreationParams.Keys.SUBSCRIPTION_TYPE, params.getSubscriptionType(), jsnBuilder);
		putJsonIfValue(DBCSEnvCreationParams.Keys.VERSION, params.getVersion(), jsnBuilder);
		putJsonIfValue(DBCSEnvCreationParams.Keys.EDITION, params.getEdition(), jsnBuilder);
		putJsonIfValue(DBCSEnvCreationParams.Keys.DESCRIPTION, params.getDescription(), jsnBuilder);
		putJsonIfValue(DBCSEnvCreationParams.Keys.SHAPE, params.getShape(), jsnBuilder);
		putJsonIfValue(DBCSEnvCreationParams.Keys.SSH_PUBLIC_KEY_NAMED, params.getSshPublicKeyNamed(), jsnBuilder);
		putJsonIfValue(DBCSEnvCreationParams.Keys.SSH_PUBLIC_KEY_TEXT, params.getSshPublicKeyText(), jsnBuilder);

		JSONBuilder jsnParamsBuilder = jsnBuilder.key(DBCSEnvCreationParams.Keys.PARAMETERS).array();
		jsnParamsBuilder.object();
		putJsonIfValue(DBCSEnvCreationParams.Keys.TYPE, params.getType(), jsnParamsBuilder);
		putJsonIfValue(DBCSEnvCreationParams.Keys.USABLE_STORAGE, params.getUsableStorage(), jsnParamsBuilder);
		putJsonIfValue(DBCSEnvCreationParams.Keys.ADMIN_PASSWORD, params.getAdminPassword(), jsnParamsBuilder);
		putJsonIfValue(DBCSEnvCreationParams.Keys.SID, params.getSid(), jsnParamsBuilder);
		putJsonIfValue(DBCSEnvCreationParams.Keys.PDB_NAME, params.getPdbName(), jsnParamsBuilder);
		putJsonIfValue(DBCSEnvCreationParams.Keys.FAILOVER_DATABASE, params.getFailoverDatabase(), jsnParamsBuilder);
		putJsonIfValue(DBCSEnvCreationParams.Keys.BACKUP_DESTINATION, params.getBackupDestination(), jsnParamsBuilder);
		putJsonIfValue(DBCSEnvCreationParams.Keys.CLOUD_STORAGE_CONTAINER, params.getCloudStorageContainer(),
				jsnParamsBuilder);
		putJsonIfValue(DBCSEnvCreationParams.Keys.CLOUD_STORAGE_USER, params.getCloudStorageUser(), jsnParamsBuilder);
		putJsonIfValue(DBCSEnvCreationParams.Keys.CLOUD_STORAGE_PASSWORD, params.getCloudStoragePassword(),
				jsnParamsBuilder);
		jsnParamsBuilder.endObject();
		jsnParamsBuilder.endArray();
		jsnBuilder.endObject();

		Response resp = invocBuilder.post(Entity.json(JSONObject.fromObject(jsonWriter.toString())));

		return getManageStatus(resp);
	}

	/**
	 * This method populates jsonBuilder only if the parameter received is not
	 * null and is not empty.
	 * 
	 * @param paramName
	 *            The name of the parameter key to be set in the jsonBuilder
	 * @param paramValue
	 *            The value of the parameter to be set in jsonBuilder
	 * @param jsonBuilder
	 *            The jsonBuilder already instantiated
	 */
	private void putJsonIfValue(String paramName, String paramValue, JSONBuilder jsonBuilder) {
		if (paramValue != null && !(paramValue.trim().equals(EMPTY_STRING))) {
			jsonBuilder.key(paramName).value(paramValue);
		}
	}

	/**
	 * Creates a DBCS Virtual Image Service.
	 * 
	 * @param creationParams
	 *            - A {@link CloudEnvVICreationParams} instance containing the
	 *            information to create the DBCS Virtual Image Service.
	 * @return Returns an instance of {@link ManageStatus} with the status of
	 *         the execution.
	 */
	@Override
	public ManageStatus createOracleServiceVirtualImage(CloudEnvVICreationParams creationParams) {
		if (creationParams.getVersion().equals(DBCSEnvCreationParams.Version.VERSION_12_1_0_2)
				&& creationParams.getEdition().equals(DBCSEnvCreationParams.Edition.STANDARD_EDITION_ONE)) {
			throw new IllegalArgumentException("The Edition [" + DBCSEnvCreationParams.Edition.STANDARD_EDITION_ONE
					+ "] is supported only for [" + DBCSEnvCreationParams.Version.VERSION_11_2_0_4 + "]");
		}

		if (!creationParams.getLevel().equals(Level.VIRTUAL_IMAGE)) {
			throw new IllegalArgumentException("The level must be set to [BASIC] and it was received ["
					+ creationParams.getLevel() + "]. Use the Level.VIRTUAL_IMAGE constant to fix it.");
		}

		Builder builder = getBaseTarget().request(CONTENT_TYPE_SERVICE_JSON);
		builder = builder.header(X_ID_TENANT_NAME, getIdentityDomain());
		builder = builder.header(CONTENT_TYPE, CONTENT_TYPE_SERVICE_JSON);

		StringWriter myJson = new StringWriter();
		JSONBuilder jsonBuilder = new JSONBuilder(myJson);
		jsonBuilder.object();

		if (mandatoryField(Keys.SERVICE_NAME, creationParams.getServiceName()))
			jsonBuilder.key(Keys.SERVICE_NAME).value(creationParams.getServiceName());
		if (mandatoryField(Keys.VERSION, creationParams.getVersion()))
			jsonBuilder.key(Keys.VERSION).value(creationParams.getVersion());
		if (mandatoryField(Keys.LEVEL, creationParams.getLevel()))
			jsonBuilder.key(Keys.LEVEL).value(creationParams.getLevel());
		if (mandatoryField(Keys.EDITION, creationParams.getEdition()))
			jsonBuilder.key(Keys.EDITION).value(creationParams.getEdition());
		if (mandatoryField(Keys.SUBSCRIPTION_TYPE, creationParams.getSubscriptionType()))
			jsonBuilder.key(Keys.SUBSCRIPTION_TYPE).value(creationParams.getSubscriptionType());
		if (creationParams.getDescription() != null && !creationParams.getDescription().trim().equals(EMPTY_STRING))
			jsonBuilder.key(Keys.DESCRIPTION).value(creationParams.getDescription());
		if (mandatoryField(Keys.SHAPE, creationParams.getShape()))
			jsonBuilder.key(Keys.SHAPE).value(creationParams.getShape());
		if ((creationParams.getSshPublicKeyNamed() == null
				|| creationParams.getSshPublicKeyNamed().trim().equals(EMPTY_STRING))
				&& (creationParams.getSshPublicKeyText() == null
						|| creationParams.getSshPublicKeyText().trim().equals(EMPTY_STRING))) {
			throw new IllegalArgumentException(
					"Mandatory argument not received. sshPublicKeyNamed or sshPublicKeyText must be set.");
		} else if (creationParams.getSshPublicKeyNamed() != null
				&& !creationParams.getSshPublicKeyNamed().trim().equals(EMPTY_STRING)) {
			jsonBuilder.key(Keys.SSH_PUBLIC_KEY_NAMED).value(creationParams.getSshPublicKeyNamed());
		} else {
			jsonBuilder.key(Keys.SSH_PUBLIC_KEY_TEXT).value(creationParams.getSshPublicKeyText());
		}
		jsonBuilder.endObject();

		Response resp = builder.post(Entity.json(JSONObject.fromObject(myJson.toString())));
		return getManageStatus(resp);
	}

	/**
	 * Deletes the service identified in the mngParam
	 * 
	 * @param mngParams
	 *            An instance of CloudServiceManageParams containing information
	 *            about be service to be deleted
	 * @return Returns an instance of {@link ManageStatus}, containing the
	 *         status of the execution
	 */
	@Override
	public ManageStatus deleteService(CloudServiceManageParams mngParams) {
		Builder builder = getBaseTarget().path(mngParams.getServiceName()).request(CONTENT_TYPE_SERVICE_JSON);
		builder = builder.header(X_ID_TENANT_NAME, getIdentityDomain());

		Response resp = builder.delete();

		return getManageStatus(resp);
	}

	/**
	 * Scales up the service identified in the mngParam
	 * 
	 * @param mngParams
	 *            An instance of CloudServiceManageParams containing information
	 *            about be service to be scaled up
	 * @return Returns an instance of {@link ManageStatus}, containing the
	 *         status of the execution
	 */
	@Override
	public ManageStatus scaleUpService(CloudServiceManageParams mngParams) {
		if (!(mngParams instanceof DBCSScaleUpParams)) {
			throw new IllegalArgumentException("Received an instance of [" + mngParams.getClass().getName()
					+ "] but expect an instance of [" + DBCSScaleUpParams.class.getName() + "]");
		}
		DBCSScaleUpParams params = (DBCSScaleUpParams) mngParams;

		Builder builder = getBaseTarget().path(mngParams.getServiceName()).request(CONTENT_TYPE_SERVICE_JSON);
		builder = builder.header(X_ID_TENANT_NAME, getIdentityDomain());
		builder = builder.header(CONTENT_TYPE, CONTENT_TYPE_SERVICE_JSON);

		String suShape = params.getShape();

		JSONObject scaleObj = null;

		if (suShape != null && params.getAdditionalStorage() > 0) {
			Object objParams[] = new Object[] { suShape, params.getAdditionalStorage() + EMPTY_STRING };
			scaleObj = JSONObject
					.fromObject(MessageFormat.format(DBCSConstants.DBCS_JSON_SCALE_UP_SHAPE_STORAGE, objParams));
		} else if (suShape != null) {
			Object objParams[] = new String[] { suShape };
			String sJson = MessageFormat.format(DBCSConstants.DBCS_JSON_SCALE_UP_SHAPE, objParams);
			scaleObj = JSONObject.fromObject(sJson);
		} else if (params.getAdditionalStorage() > 0) {
			Object objParams[] = new Object[] { params.getAdditionalStorage() + EMPTY_STRING };
			scaleObj = JSONObject.fromObject(MessageFormat.format(DBCSConstants.DBCS_JSON_SCALE_UP_STORAGE, objParams));
		} else {
			throw new IllegalArgumentException(
					"A shape or additionalParameter is required and both were received with no value");
		}

		Response resp = builder.put(Entity.json(scaleObj));

		return getManageStatus(resp);
	}

	/**
	 * This method lists all services created in the given DBCS Identity Domain.
	 * 
	 * @return Returns an ArrayList containing instances of
	 *         {@link OCloudService} object.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<OCloudService> getServices() {
		try {
			Builder builder = getBaseTarget().request(CONTENT_TYPE_SERVICE_JSON);
			builder = builder.header(X_ID_TENANT_NAME, getIdentityDomain());
			builder = builder.header(CONTENT_TYPE, CONTENT_TYPE_SERVICE_JSON);

			Response resp = builder.get();
			Object obj = resp.readEntity(JSONObject.class);
			ArrayList<OCloudService> cloudServices = new ArrayList<OCloudService>();

			if (obj instanceof HashMap<?, ?>) {
				for (@SuppressWarnings("rawtypes")
				HashMap server : (ArrayList<HashMap<?, ?>>) ((HashMap<?, ?>) obj).get("services")) {
					this.convertHashMapToCamel(server);
					OCloudService service = new OCloudService();
					BeanUtils.populate(service, server);
					cloudServices.add(service);
				}
			}
			return cloudServices;
		} catch (Exception ex) {
			ex.printStackTrace();
			System.err.println(ex);
			throw new RuntimeException(ex);
		}
	}

	/**
	 * Read the DBCS service identified by serviceName received as parameter.
	 * 
	 * @param serviceName
	 *            - the name of the service to be read from Cloud
	 * @return Returns a {@link DBCSServiceInformation} instance containing the
	 *         information about the service read from Cloud.
	 */
	@Override
	public DBCSServiceInformation readService(String serviceName) {
		Builder builder = getBaseTarget().path(serviceName).request(CONTENT_TYPE_SERVICE_JSON);
		builder = builder.header(X_ID_TENANT_NAME, getIdentityDomain());
		builder = builder.header(CONTENT_TYPE, CONTENT_TYPE_SERVICE_JSON);
		Response resp = builder.get();
		Object obj = resp.readEntity(JSONObject.class);

		DBCSServiceInformation serviceInfo = null;
		if (obj != null && obj instanceof HashMap<?, ?>) {
			@SuppressWarnings("rawtypes")
			HashMap hm = (HashMap) obj;
			convertHashMapToCamel(hm);
			serviceInfo = new DBCSServiceInformation();
			try {
				BeanUtils.populate(serviceInfo, hm);
			} catch (IllegalAccessException | InvocationTargetException e) {
				throw new IllegalAccessError(e.getMessage());
			}
		}

		return serviceInfo;
	}

	/**
	 * Receives a HashMap containing the keys split by underscore (user_name)
	 * and converts it to java camel style (userName). The keys with no
	 * underscore are returned with original name.
	 * 
	 * @param underlinedHashMap
	 *            a HashMap containing keys split by underscore (e.g. user_name)
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void convertHashMapToCamel(HashMap underlinedHashMap) {
		Object[] keys = underlinedHashMap.keySet().toArray();

		for (Object key : keys) {
			String newKey = (String) (((String) key).contains(S_UNDERSCORE) ? underscoredToCamel((String) key) : key);

			if (!key.equals(newKey)) {
				underlinedHashMap.put(newKey, underlinedHashMap.get(key));
				underlinedHashMap.remove(key);
			}
		}
	}

	/**
	 * @param param
	 *            a word split by underscore (e.g. user_name)
	 * @return Returns the same word converted to java camel style (e.g.
	 *         userName)
	 */
	private String underscoredToCamel(String param) {
		return WordUtils
				.uncapitalize(StringUtils.remove(WordUtils.capitalize(param, UNDERSCORE_AS_CHAR_ARR), UNDERSCORE));
	}

	/**
	 * Verifies if a mandatory field has valid value (not null and not blank).
	 * 
	 * @param fieldName
	 *            The name of the mandatory field. Will be used in the exception
	 *            message in case of error.
	 * @param fieldValue
	 *            The field value to be verified.
	 * @return Returns true if the fieldValue is valid or throws an
	 *         {@link IllegalArgumentException} otherwise.
	 */
	private boolean mandatoryField(String fieldName, String fieldValue) {
		if (fieldValue != null && (!fieldValue.trim().equals(EMPTY_STRING)))
			return true;
		else
			throw new IllegalArgumentException(
					"Missing mandatory argument [" + fieldName + "] received with value[" + fieldValue + "]");
	}

	/**
	 * Executes management actions in the service instance identified in
	 * mngParams
	 * 
	 * @param mngParams
	 *            An instance of CloudServiceManageParams containing information
	 *            about be service to be managed
	 * @param jsonObj
	 *            The JSON Message to be sent in the execution
	 * @return Returns an instance of {@link ManageStatus}, containing the
	 *         status of the execution
	 */
	private ManageStatus manageServiceState(CloudServiceManageParams mngParams, JSONObject jsonObj) {
		try {
			Builder builder = getBaseTarget().path(mngParams.getServiceName()).request(CONTENT_TYPE_SERVICE_JSON);
			builder = builder.header(X_ID_TENANT_NAME, getIdentityDomain());
			builder = builder.header(CONTENT_TYPE, CONTENT_TYPE_SERVICE_JSON);

			Response resp = builder.post(Entity.json(jsonObj));
			return getManageStatus(resp);
		} catch (RuntimeException rex) {
			System.err.println(rex);
			throw rex;
		}
	}

}
