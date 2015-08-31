package com.oracle.cloud.core.beans;

/**
 * This class contains the base parameters for creation of Cloud Tooling
 * instances and can be overwritten by more specific classes if necessary.
 * 
 * @author eduardo.r.oliveira@oracle.com
 *
 */
public class CloudEnvCreationParams extends CloudEnvVICreationParams {
	public interface Keys extends CloudEnvVICreationParams.Keys {
		public static final String CLOUD_STORAGE_CONTAINER = "cloudStorageContainer";
		public static final String CLOUD_STORAGE_USER = "cloudStorageUser";
		public static final String CLOUD_STORAGE_PASSWORD = "cloudStoragePwd";
		public static final String TYPE = "type";
		public static final String ADMIN_PASSWORD = "adminPassword";
	}

	private String cloudStorageContainer;
	private String cloudStorageUser;
	private String cloudStoragePassword;
	private String type;
	private String adminPassword;

	/**
	 * @return Returns the Oracle Cloud Storage Container name
	 */
	public String getCloudStorageContainer() {
		return cloudStorageContainer;
	}

	/**
	 * @param storageContainer the Oracle Cloud Storage Container name
	 */
	public void setCloudStorageContainer(String storageContainer) {
		this.cloudStorageContainer = storageContainer;
	}

	/**
	 * @return Returns the Oracle Cloud Storage user
	 */
	public String getCloudStorageUser() {
		return cloudStorageUser;
	}

	/**
	 * @param storageUser the Oracle Cloud Storage user
	 */
	public void setCloudStorageUser(String storageUser) {
		this.cloudStorageUser = storageUser;
	}

	/**
	 * @return Returns the Oracle Cloud Storage password
	 */
	public String getCloudStoragePassword() {
		return cloudStoragePassword;
	}

	/**
	 * @param storagePassword the Oracle Cloud Storage password
	 */
	public void setCloudStoragePassword(String storagePassword) {
		this.cloudStoragePassword = storagePassword;
	}

	/**
	 * @return Returns the type of Service as db, for example
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type of Service as db, for example
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return Returns the Service admin password
	 */
	public String getAdminPassword() {
		return adminPassword;
	}

	/**
	 * @param adminPassword the Service admin password
	 */
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

}
