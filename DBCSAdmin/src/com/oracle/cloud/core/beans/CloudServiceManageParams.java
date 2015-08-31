package com.oracle.cloud.core.beans;

/**
 * This class contains the fields to do manage actions in the Oracle Cloud
 * Services as stop, delete, start, etc.
 * 
 * @author eduardo.r.oliveira@oracle.com
 *
 */
public class CloudServiceManageParams {
	private String serviceName;
	private String cloudUser;
	private String cloudPassword;

	/**
	 * @return Returns the Oracle Cloud service name
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * @return Returns the Oracle Cloud user
	 */
	public String getCloudUser() {
		return cloudUser;
	}

	/**
	 * @return Returns the Oracle Cloud password
	 */
	public String getCloudPassword() {
		return cloudPassword;
	}

	/**
	 * @param serviceName
	 *            the Oracle Cloud service name to be set
	 */
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	/**
	 * @param cloudUser
	 *            the Oracle Cloud user. Usually an email address.
	 */
	public void setCloudUser(String cloudUser) {
		this.cloudUser = cloudUser;
	}

	/**
	 * @param cloudPassword
	 *            the Oracle Cloud password
	 */
	public void setCloudPassword(String cloudPassword) {
		this.cloudPassword = cloudPassword;
	}
}
