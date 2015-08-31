import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;

import com.oracle.cloud.core.OracleCloudAdmin;
import com.oracle.cloud.core.beans.CloudEnvVICreationParams;
import com.oracle.cloud.core.beans.OCloudService;
import com.oracle.cloud.core.beans.ServiceInformation;
import com.oracle.cloud.dbcs.DBCSCloudAdmin;
import com.oracle.cloud.dbcs.beans.DBCSEnvCreationParams;
import com.oracle.cloud.dbcs.beans.DBCSEnvCreationParams.BackupDestination;
import com.oracle.cloud.dbcs.beans.DBCSEnvCreationParams.Edition;
import com.oracle.cloud.dbcs.beans.DBCSEnvCreationParams.Version;
import com.oracle.cloud.dbcs.beans.DBCSScaleUpParams;
import com.oracle.cloud.dbcs.util.DBCSConstants;

public class DBCSCloudAdminSampleUsage {
	private static final OracleCloudAdmin dbcsOracleJson = new DBCSCloudAdmin(PrivateConstant.USERNAME,
			PrivateConstant.PASSWORD, PrivateConstant.IDENTITY_DOMAIN, DBCSConstants.DBCS_INSTANCES_URL);

	public void testStopService(String serviceName) {
		System.out.println("\nStopping Service:\n==================");
		try {
			DBCSScaleUpParams mngParams = new DBCSScaleUpParams();
			mngParams.setServiceName(serviceName);
			mngParams.setCloudUser(PrivateConstant.USERNAME);
			mngParams.setCloudPassword(PrivateConstant.PASSWORD);

			System.out.println("Response [" + dbcsOracleJson.stopService(mngParams) + "]");
		} catch (RuntimeException ex) {
			System.err.println(ex);
			System.out.println(ex.getStackTrace());
		}
	}

	public void testStartService(String serviceName) {
		System.out.println("\nStarting Service:\n==================");
		try {
			DBCSScaleUpParams mngParams = new DBCSScaleUpParams();
			mngParams.setServiceName(serviceName);
			mngParams.setCloudUser(PrivateConstant.USERNAME);
			mngParams.setCloudPassword(PrivateConstant.PASSWORD);

			System.out.println("Response [" + dbcsOracleJson.startService(mngParams) + "]");
		} catch (RuntimeException ex) {
			System.err.println(ex);
			System.out.println(ex.getStackTrace());
		}
	}

	public void testScaleUp(String serviceName) {
		System.out.println("\nScaling Up Service:\n==================");
		try {
			DBCSScaleUpParams mngParams = new DBCSScaleUpParams();
			mngParams.setServiceName(serviceName);
			mngParams.setCloudUser(PrivateConstant.USERNAME);
			mngParams.setCloudPassword(PrivateConstant.PASSWORD);
			mngParams.setShape(DBCSScaleUpParams.Shape._2_OCPU_30_GB);
			// mngParams.setAdditionalStorage(1000);

			System.out.println("Response [" + dbcsOracleJson.scaleUpService(mngParams) + "]");
		} catch (RuntimeException ex) {
			System.err.println(ex);
			System.out.println(ex.getStackTrace());
		}
	}

	public void testCreateVIService(String serviceName) {
		System.out.println("\nCreating Virtual Image Service:\n==================");
		CloudEnvVICreationParams params = new CloudEnvVICreationParams();

		params.setServiceName(serviceName);
		params.setDescription("Service Description");
		params.setEdition(Edition.STANDARD_EDITION_ONE);
		params.setLevel(CloudEnvVICreationParams.Level.VIRTUAL_IMAGE.toString());
		params.setShape(CloudEnvVICreationParams.Shape._1_OCPU_15_GB);
		params.setSshPublicKeyText(PrivateConstant.MY_SSH_KEY);
		params.setSubscriptionType(CloudEnvVICreationParams.SubscriptionType.MONTHLY.toString());
		params.setVersion(Version.VERSION_11_2_0_4);

		System.out.println(dbcsOracleJson.createOracleServiceVirtualImage(params));
	}

	public void testCreateService(String serviceName) {
		System.out.println("\nCreating Tooling Service:\n==================");
		try {
			DBCSEnvCreationParams params = new DBCSEnvCreationParams();
			params.setAdminPassword("Welcome1#");
			params.setBackupDestination(BackupDestination.BOTH.toString());
			params.setDescription("Service Description");
			params.setEdition(Edition.STANDARD_EDITION_ONE);
			params.setServiceName(serviceName);
			params.setLevel(CloudEnvVICreationParams.Level.PAAS);
			// params.setPdbName("pdb1");
			params.setShape(CloudEnvVICreationParams.Shape._1_OCPU_15_GB);
			params.setSid("orcl");
			params.setSshPublicKeyText(PrivateConstant.MY_SSH_KEY);
			params.setCloudStorageContainer(PrivateConstant.STORAGE_CONTAINER);
			params.setCloudStorageUser(PrivateConstant.STORAGE_USER);
			params.setCloudStoragePassword(PrivateConstant.STORAGE_PASSWORD);
			params.setSubscriptionType(CloudEnvVICreationParams.SubscriptionType.MONTHLY);
			params.setUsableStorage("15");
			params.setVersion(Version.VERSION_11_2_0_4);

			params.setType(DBCSEnvCreationParams.DEFAULT_TYPE_DB);
			params.setFailoverDatabase(DBCSEnvCreationParams.DEFAULT_FAILOVER_DATABASE);

			System.out.println("Response [" + dbcsOracleJson.createOracleService(params) + "]");
		} catch (RuntimeException ex) {
			System.err.println(ex);
			System.out.println(ex.getStackTrace());
		}
	}

	public void testDeleteService(String serviceName) {
		System.out.println("\nDeleting Service:\n==================");
		try {
			DBCSScaleUpParams mngParams = new DBCSScaleUpParams();
			mngParams.setServiceName(serviceName);
			mngParams.setCloudUser(PrivateConstant.USERNAME);
			mngParams.setCloudPassword(PrivateConstant.PASSWORD);

			System.out.println("Response [" + dbcsOracleJson.deleteService(mngParams) + "]");
		} catch (RuntimeException ex) {
			System.err.println(ex);
			System.out.println(ex.getStackTrace());
		}
	}

	public void testListServices() {
		System.out.println("\nListing Services:\n==================");
		try {
			ArrayList<OCloudService> services = dbcsOracleJson.getServices();
			Iterator<OCloudService> it = services.iterator();

			while (it.hasNext()) {
				System.out.println(it.next());
			}
		} catch (RuntimeException ex) {
			System.err.println(ex);
			System.out.println(ex.getStackTrace());
		}
	}

	public void testReadService(String serviceName) {
		ServiceInformation si = dbcsOracleJson.readService(serviceName);
		System.out.println(si);
	}

	public static void main(String[] args) {
		Properties props = System.getProperties();
		if ((props.containsKey("username") && props.containsKey("password") && props.containsKey("identity-domain")
				&& props.containsKey("storage-container") && props.containsKey("storage-user")
				&& props.containsKey("storage-password") && props.containsKey("ssh-key"))
				&& (args != null && args.length > 0)) {
			HashMap<String, String> hmArgs = new HashMap<String, String>();
			for (String arg : args) {
				String[] arrArgs = arg.split("=");
				hmArgs.put(arrArgs[0], arrArgs[1]);
			}
			if (hmArgs.containsKey("action")) {
				if ((!hmArgs.get("action").equals("list-services")) && !(hmArgs.containsKey("service-name"))) {
					System.err.println(
							"The parameter service-name is mandatory for action [" + hmArgs.get("action") + "]");
					showSyntax();
				} else {
					String serviceName = hmArgs.get("service-name");
					DBCSCloudAdminSampleUsage admin = new DBCSCloudAdminSampleUsage();
					switch (hmArgs.get("action")) {
					case "list-services":
						admin.testListServices();
						break;
					case "create-service":
						admin.testCreateService(serviceName);
						break;
					case "create-vi-service":
						admin.testCreateVIService(serviceName);
						break;
					case "delete-service":
						admin.testDeleteService(serviceName);
						break;
					case "read-service":
						admin.testReadService(serviceName);
						break;
					case "scale-up":
						admin.testScaleUp(serviceName);
						break;
					case "stop-service":
						admin.testStopService(serviceName);
						break;
					case "start-service":
						admin.testStartService(serviceName);
						break;

					default:
						showSyntax();
						break;
					}

				}
			} else {
				System.err.println("The parameter action is mandatory");
				showSyntax();
			}
		} else {
			showSyntax();
		}
	}

	private static void showSyntax() {
		System.out.println("Syntax: java -cp DBCSCloudAdmin.jar -Dusername=cloudUser@company.com -Dpassword=cloudPassword "
				+ "-Didentity-domain=identityDomainName -Dstorage-container=Storage-identityDomainName "
				+ "-Dstorage-user=cloudStorageUser@company.com -Dstorage-password=cloudStoragePassword "
				+ "-Dssh-key=publicSshKeyAsText DBCSCloudAdminSampleUsage service-name=serviceName "
				+ "action=[list-services|create-service|create-vi-service|delete-service|read-service"
				+ "|scale-up|stop-service|start-service]");
	}
}

class PrivateConstant {

	public static final String USERNAME;

	public static final String PASSWORD;

	public static final String IDENTITY_DOMAIN;

	public static final String STORAGE_CONTAINER;

	public static final String STORAGE_USER;

	public static final String STORAGE_PASSWORD;

	public static final String MY_SSH_KEY;

	static {
		Properties props = System.getProperties();
		USERNAME = props.getProperty("username");
		PASSWORD = props.getProperty("password");
		IDENTITY_DOMAIN = props.getProperty("identity-domain");
		STORAGE_CONTAINER = props.getProperty("storage-container");
		STORAGE_USER = props.getProperty("storage-user");
		STORAGE_PASSWORD = props.getProperty("storage-password");
		MY_SSH_KEY = props.getProperty("ssh-key");
	}
}

