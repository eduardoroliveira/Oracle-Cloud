package com.oracle.cloud.dbcs.beans;

import com.oracle.cloud.core.beans.ServiceInformation;

/**
 * This class contains the fields returned when reading a specific DBCS Service
 * 
 * @author eduardo.r.oliveira@oracle.com
 *
 */
public class DBCSServiceInformation extends ServiceInformation {
	private String jaasInstancesUsingService;
	private String cloudStorageContainer;
	private String sid;
	private String pdbName;
	private String listenerPort;
	private String emUrl;
	private String connectDescriptor;
	private String apexUrl;
	private String glassfishUrl;
	private String dbaasmonitorUrl;
	private String pdbssUrl;

	/**
	 * @return Returns the JCS instances using the DBCS Service
	 */
	public String getJaasInstancesUsingService() {
		return jaasInstancesUsingService;
	}

	/**
	 * @param jaasInstancesUsingService
	 *            the JCS instances using the DBCS Service given
	 */
	public void setJaasInstancesUsingService(String jaasInstancesUsingService) {
		this.jaasInstancesUsingService = jaasInstancesUsingService;
	}

	/**
	 * @return Returns the DBCS Service Cloud storage container
	 */
	public String getCloudStorageContainer() {
		return cloudStorageContainer;
	}

	/**
	 * @return Returns the DBCS Service SID (service id name)
	 */
	public String getSid() {
		return sid;
	}

	/**
	 * @return Returns the DBCS Service PDB (pluggable database name)
	 */
	public String getPdbName() {
		return pdbName;
	}

	/**
	 * @return Returns the DBCS Service listener port
	 */
	public String getListenerPort() {
		return listenerPort;
	}

	/**
	 * @return Returns the DBCS Service Enterprise Manager URL
	 */
	public String getEmUrl() {
		return emUrl;
	}

	/**
	 * @return Returns the connection descriptor
	 */
	public String getConnectDescriptor() {
		return connectDescriptor;
	}

	/**
	 * @return Returns the APEX URL
	 */
	public String getApexUrl() {
		return apexUrl;
	}

	/**
	 * @return Returns the Glassfish URL
	 */
	public String getGlassfishUrl() {
		return glassfishUrl;
	}

	/**
	 * @return Returns the DBAAS Monitor
	 */
	public String getDbaasmonitorUrl() {
		return dbaasmonitorUrl;
	}

	/**
	 * @return Returns the PDB Self Service URL
	 */
	public String getPdbssUrl() {
		return pdbssUrl;
	}

	/**
	 * @param cloudStorageContainer
	 *            the storage container path in the format
	 *            Storage-&lt;identityDomain&gt;/&lt;containerName&gt;
	 */
	public void setCloudStorageContainer(String cloudStorageContainer) {
		this.cloudStorageContainer = cloudStorageContainer;
	}

	/**
	 * @param sid
	 *            the SID Service ID
	 */
	public void setSid(String sid) {
		this.sid = sid;
	}

	/**
	 * @param pdbName
	 *            the pluggable database name
	 */
	public void setPdbName(String pdbName) {
		this.pdbName = pdbName;
	}

	/**
	 * @param listenerPort
	 *            the database listener port
	 */
	public void setListenerPort(String listenerPort) {
		this.listenerPort = listenerPort;
	}

	/**
	 * @param emUrl
	 *            the enterprise manager URL
	 */
	public void setEmUrl(String emUrl) {
		this.emUrl = emUrl;
	}

	/**
	 * @param connectDescriptor
	 *            the connection descriptor
	 */
	public void setConnectDescriptor(String connectDescriptor) {
		this.connectDescriptor = connectDescriptor;
	}

	/**
	 * @param apexUrl the APEX URL
	 */
	public void setApexUrl(String apexUrl) {
		this.apexUrl = apexUrl;
	}

	/**
	 * @param glassfishUrl the Glassfish URL
	 */
	public void setGlassfishUrl(String glassfishUrl) {
		this.glassfishUrl = glassfishUrl;
	}

	/**
	 * @param dbaasmonitorUrl the DBaaS Monitor URL
	 */
	public void setDbaasmonitorUrl(String dbaasmonitorUrl) {
		this.dbaasmonitorUrl = dbaasmonitorUrl;
	}

	/**
	 * @param pdbssUrl the PDB self service URL
	 */
	public void setPdbssUrl(String pdbssUrl) {
		this.pdbssUrl = pdbssUrl;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer(super.toString());
		sb.append(", jaasInstancesUsingService[").append(jaasInstancesUsingService).append("], ");
		sb.append("cloudStorageContainer[").append(cloudStorageContainer).append("], ");
		sb.append("sid[").append(sid).append("], ");
		sb.append("pdbName[").append(pdbName).append("], ");
		sb.append("listenerPort[").append(listenerPort).append("], ");
		sb.append("emUrl[").append(emUrl).append("], ");
		sb.append("connectDescriptor[").append(connectDescriptor).append("], ");
		sb.append("apexUrl[").append(apexUrl).append("], ");
		sb.append("glassfishUrl[").append(glassfishUrl).append("], ");
		sb.append("dbaasmonitorUrl[").append(dbaasmonitorUrl).append("], ");
		sb.append("pdbssUrl[").append(pdbssUrl).append("]");
		return sb.toString();
	}
}
