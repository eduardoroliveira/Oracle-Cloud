package com.oracle.cloud.core.beans;

/**
 * This class contains base fields for Oracle Cloud Services, usually returned
 * when all services are listed in the root level
 * 
 * @author eduardo.r.oliveira@oracle.com
 *
 */
public class OCloudService {
	private String serviceName;
	private String version;
	private String status;
	private String description;
	private String identityDomain;
	private String creationTime;
	private String lastModifiedTime;
	private String createdBy;
	private String serviceUri;

	/**
	 * @return Returns the service name
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * @param serviceName
	 *            the service name to set
	 */
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	/**
	 * @return the service version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @param version
	 *            the service version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * @return the service status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the service status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the service description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the service description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the service identity domain
	 */
	public String getIdentityDomain() {
		return identityDomain;
	}

	/**
	 * @param identityDomain
	 *            the service identity domain to set
	 */
	public void setIdentityDomain(String identityDomain) {
		this.identityDomain = identityDomain;
	}

	/**
	 * @return the service creation time
	 */
	public String getCreationTime() {
		return creationTime;
	}

	/**
	 * @param creationTime
	 *            the service creation time to set
	 */
	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	/**
	 * @return the service last modified time
	 */
	public String getLastModifiedTime() {
		return lastModifiedTime;
	}

	/**
	 * @param lastModifiedTime
	 *            the service last modified time to set
	 */
	public void setLastModifiedTime(String lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}

	/**
	 * @return the user of service creator
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy
	 *            the user of service creator
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the service URI
	 */
	public String getServiceUri() {
		return serviceUri;
	}

	/**
	 * @param serviceUri
	 *            the service URI to set
	 */
	public void setServiceUri(String serviceUri) {
		this.serviceUri = serviceUri;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("serviceName[").append(serviceName).append("], ");
		sb.append("version[").append(version).append("], ");
		sb.append("status[").append(status).append("], ");
		sb.append("description[").append(description).append("], ");
		sb.append("identityDomain[").append(identityDomain).append("], ");
		sb.append("creationTime[").append(creationTime).append("], ");
		sb.append("lastModifiedTime[").append(lastModifiedTime).append("], ");
		sb.append("createdBy[").append(createdBy).append("], ");
		sb.append("serviceUri[").append(serviceUri).append("]");

		return sb.toString();
	}

}
