package com.oracle.cloud.core.beans;

import com.oracle.cloud.core.beans.CloudEnvVICreationParams.Level;
import com.oracle.cloud.core.beans.CloudEnvVICreationParams.Shape;
import com.oracle.cloud.core.beans.CloudEnvVICreationParams.SubscriptionType;

/**
 * This class contains base fields for Oracle Cloud Services, usually returned
 * when a specific service is read
 * 
 * @author eduardo.r.oliveira@oracle.com
 *
 */
public class ServiceInformation extends OCloudService {
	private String shape;
	private String level;
	private String backupDestination;
	private String edition;
	private String numNodes;
	private String subscriptionType;
	private String creationJobId;
	private String numIpReservations;

	/**
	 * @return the service shape
	 */
	public String getShape() {
		return shape;
	}

	/**
	 * @param shape
	 *            the service shape to set. Refer to {@link Shape} for valid
	 *            values.
	 */
	public void setShape(String shape) {
		this.shape = shape;
	}

	/**
	 * @return the service level. Refer to {@link Level} for valid values.
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * @param level
	 *            the service level. Refer to {@link Level} for valid values.
	 */
	public void setLevel(String level) {
		this.level = level;
	}

	/**
	 * @return the service backup destination.
	 */
	public String getBackupDestination() {
		return backupDestination;
	}

	/**
	 * @param backupDestination
	 *            the service backup destination to set
	 */
	public void setBackupDestination(String backupDestination) {
		this.backupDestination = backupDestination;
	}

	/**
	 * @return the service edition.
	 */
	public String getEdition() {
		return edition;
	}

	/**
	 * @param edition
	 *            the service edition to set.
	 */
	public void setEdition(String edition) {
		this.edition = edition;
	}

	/**
	 * @return the service number of nodes
	 */
	public String getNumNodes() {
		return numNodes;
	}

	/**
	 * @param numNodes
	 *            the service number of nodes
	 */
	public void setNumNodes(String numNodes) {
		this.numNodes = numNodes;
	}

	/**
	 * @return the service subscription type. Refer to {@link SubscriptionType}
	 *         for valid values.
	 */
	public String getSubscriptionType() {
		return subscriptionType;
	}

	/**
	 * @param subscriptionType
	 *            the service subscription type. Refer to
	 *            {@link SubscriptionType} for valid values.
	 */
	public void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
	}

	/**
	 * @return the service creation job Id
	 */
	public String getCreationJobId() {
		return creationJobId;
	}

	/**
	 * @param creationJobId
	 *            the service creation job id to set
	 */
	public void setCreationJobId(String creationJobId) {
		this.creationJobId = creationJobId;
	}

	/**
	 * @return the service number of IP address reservation
	 */
	public String getNumIpReservations() {
		return numIpReservations;
	}

	/**
	 * @param numIpReservations
	 *            the service number of IP address reservation to set
	 */
	public void setNumIpReservations(String numIpReservations) {
		this.numIpReservations = numIpReservations;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer(super.toString());
		sb.append(", shape[").append(shape).append("], ");
		sb.append("level[").append(level).append("], ");
		sb.append("backupDestination[").append(backupDestination).append("], ");
		sb.append("edition[").append(edition).append("], ");
		sb.append("numNodes[").append(numNodes).append("], ");
		sb.append("subscriptionType[").append(subscriptionType).append("], ");
		sb.append("creationJobId[").append(creationJobId).append("], ");
		sb.append("numIpReservations[").append(numIpReservations).append("]");
		return sb.toString();
	}
}
