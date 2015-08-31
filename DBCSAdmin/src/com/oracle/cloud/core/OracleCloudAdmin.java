package com.oracle.cloud.core;

import java.util.ArrayList;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.StatusType;

import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

import com.oracle.cloud.core.beans.CloudEnvCreationParams;
import com.oracle.cloud.core.beans.CloudEnvVICreationParams;
import com.oracle.cloud.core.beans.CloudServiceManageParams;
import com.oracle.cloud.core.beans.ManageStatus;
import com.oracle.cloud.core.beans.OCloudService;
import com.oracle.cloud.core.beans.ServiceInformation;

/**
 * This class must be extended and will permit the management of the Oracle
 * Cloud Environments extending it.
 * 
 * @author eduardo.r.oliveira@oracle.com
 *
 */
public abstract class OracleCloudAdmin {
	protected static final String X_ID_TENANT_NAME = "X-ID-TENANT-NAME";

	protected static final String CONTENT_TYPE = "Content-Type";

	protected static final String ACCEPT = "Accept";

	protected static final String CONTENT_TYPE_SERVICE_JSON = MediaType.APPLICATION_JSON;

	private String username;
	private String password;
	private String identityDomain;
	private String instancesUrl;
	private WebTarget target;

	/**
	 * 
	 * @param username
	 *            The Oracle Cloud user name
	 * @param password
	 *            The Oracle Cloud password
	 * @param identityDomain
	 *            The Oracle Cloud identity domain
	 * @param instancesUrl
	 *            The Oracle Cloud instance url
	 */
	public OracleCloudAdmin(String username, String password, String identityDomain, String instancesUrl) {
		this.username = username;
		this.password = password;
		this.identityDomain = identityDomain;
		this.instancesUrl = instancesUrl;
		HttpAuthenticationFeature authFeature = HttpAuthenticationFeature.basic(username, password);
		Client c = ClientBuilder.newClient();
		c.register(authFeature);
		target = c.target(instancesUrl);
	}

	/**
	 * @return Returns the URL containing also the identity domain
	 */
	protected WebTarget getBaseTarget() {
		return target.path(identityDomain);
	}

	/**
	 * @return Returns the Oracle Cloud user name
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the Oracle Cloud user name
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return Returns the Oracle Cloud Password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the Oracle Cloud Password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return Returns the identity domain name
	 */
	public String getIdentityDomain() {
		return identityDomain;
	}

	/**
	 * @param identityDomain
	 *            the identity domain name
	 */
	public void setIdentityDomain(String identityDomain) {
		this.identityDomain = identityDomain;
	}

	/**
	 * @return Returns the instance URL, for example
	 *         https://dbaas.oraclecloud.com/paas/service/dbcs/api/v1.1/
	 *         instances for DBCS
	 */
	public String getInstancesUrl() {
		return instancesUrl;
	}

	/**
	 * @param instancesUrl
	 *            the instance URL, for example
	 *            https://dbaas.oraclecloud.com/paas/service/dbcs/api/v1.1/
	 *            instances for DBCS
	 */
	public void setInstancesUrl(String instancesUrl) {
		this.instancesUrl = instancesUrl;
	}

	/**
	 * @return Returns the URL containing also the identity domain
	 */
	protected WebTarget getTarget() {
		return target;
	}

	/**
	 * @param resp
	 *            A response received after a REST call
	 * @return Returns a {@link ManageStatus} object containing response
	 *         information like response code, message, status and additional
	 *         info as error messages.
	 */
	protected ManageStatus getManageStatus(Response resp) {
		StatusType st = resp.getStatusInfo();
		ManageStatus ms = new ManageStatus();

		ms.setCode(String.valueOf(st.getStatusCode()));
		ms.setMessage(st.getReasonPhrase());
		ms.setStatus(st.getFamily().name());
		ms.setAdditionalInfo("");

		try {
			String addInfo = resp.readEntity(String.class);
			if (addInfo != null && !(addInfo.trim().equals(""))) {
				ms.setAdditionalInfo(addInfo);
			}
		} catch (Exception e) {
		}

		return ms;
	}

	/**
	 * @param creationParams
	 *            parameters to create an Oracle Tooling Service
	 * @return Returns a {@link ManageStatus} object containing response
	 *         information like response code, message, status and additional
	 *         info as error messages.
	 *
	 */
	public abstract ManageStatus createOracleService(CloudEnvCreationParams creationParams);

	/**
	 * @param creationParams
	 *            parameters to create an Oracle Virtual Image Service
	 * @return Returns a {@link ManageStatus} object containing response
	 *         information like response code, message, status and additional
	 *         info as error messages.
	 *
	 */
	public abstract ManageStatus createOracleServiceVirtualImage(CloudEnvVICreationParams creationParams);

	/**
	 * @param manageParams
	 *            parameters to identify the service to be deleted
	 * @return Returns a {@link ManageStatus} object containing response
	 *         information like response code, message, status and additional
	 *         info as error messages.
	 * 
	 */
	public abstract ManageStatus deleteService(CloudServiceManageParams manageParams);

	/**
	 * @param manageParams
	 *            parameters to identify the service to be stopped
	 * @return Returns a {@link ManageStatus} object containing response
	 *         information like response code, message, status and additional
	 *         info as error messages.
	 * 
	 */
	public abstract ManageStatus stopService(CloudServiceManageParams manageParams);

	/**
	 * @param manageParams
	 *            parameters to identify the service to be started
	 * @return Returns a {@link ManageStatus} object containing response
	 *         information like response code, message, status and additional
	 *         info as error messages.
	 * 
	 */
	public abstract ManageStatus startService(CloudServiceManageParams manageParams);

	/**
	 * @param manageParams
	 *            parameters to identify the service to be restarted
	 * @return Returns a {@link ManageStatus} object containing response
	 *         information like response code, message, status and additional
	 *         info as error messages.
	 * 
	 */
	public abstract ManageStatus restartService(CloudServiceManageParams manageParams);

	/**
	 * @param manageParams
	 *            parameters to identify the service to be scaled up
	 * @return Returns a {@link ManageStatus} object containing response
	 *         information like response code, message, status and additional
	 *         info as error messages.
	 * 
	 */
	public abstract ManageStatus scaleUpService(CloudServiceManageParams manageParams);

	/**
	 * @return Returns a list of the existing services 
	 */
	public abstract ArrayList<OCloudService> getServices();

	/**
	 * Reads the service identified by serviceName received as parameter.
	 * 
	 * @param serviceName
	 *            - the name of the service to be read from Cloud
	 * @return Returns a {@link ServiceInformation} instance that will be
	 *         specific for each specific API implementing this method.
	 */
	public abstract ServiceInformation readService(String serviceName);

}