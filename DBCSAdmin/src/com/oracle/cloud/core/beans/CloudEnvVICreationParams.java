package com.oracle.cloud.core.beans;

/**
 * This class contains the base parameters to create a Virtual Image service
 * instance, and can be overwritten by more specific classes if necessary
 * 
 * @author eduardo.r.oliveira@oracle.com
 *
 */
public class CloudEnvVICreationParams {
	/**
	 * The keys from this class as constants
	 */
	public interface Keys {
		public static final String SERVICE_NAME = "serviceName";
		public static final String LEVEL = "level";
		public static final String SUBSCRIPTION_TYPE = "subscriptionType";
		public static final String VERSION = "version";
		public static final String EDITION = "edition";
		public static final String DESCRIPTION = "description";
		public static final String SHAPE = "shape";
		public static final String SSH_PUBLIC_KEY_NAMED = "vmPublicKey";
		public static final String SSH_PUBLIC_KEY_TEXT = "vmPublicKeyText";
	}

	/**
	 * The valid service levels constants
	 *
	 */
	public interface Level {
		public final static String PAAS = "PAAS";
		public final static String VIRTUAL_IMAGE = "BASIC";
	}

	/**
	 * The valid subscription types constants. 
	 */
	public interface SubscriptionType {
		public final static String MONTHLY = "MONTHLY";
		public final static String HOURLY = "HOURLY";
	}

	
	/**
	 * The shapes available as constants
	 */
	public interface Shape {
		public final static String _1_OCPU_7_5_GB = "oc3";
		public final static String _2_OCPU_15_GB = "oc4";
		public final static String _4_OCPU_30_GB = "oc5";
		public final static String _8_OCPU_60_GB = "oc6";
		public final static String _16_OCPU_120_GB = "oc7";

		public final static String _1_OCPU_15_GB = "oc1m";
		public final static String _2_OCPU_30_GB = "oc2m";
		public final static String _4_OCPU_60_GB = "oc3m";
		public final static String _8_OCPU_120_GB = "oc4m";
		public final static String _16_OCPU_240_GB = "oc5m";
	}

	private String serviceName;
	private String level;
	private String subscriptionType;
	private String version;
	private String edition;
	private String description;
	private String shape;
	private String sshPublicKeyNamed;
	private String sshPublicKeyText;

	/**
	 * @return Returns the Oracle Cloud service name
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * @param serviceName
	 *            the Oracle Cloud service name
	 */
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	/**
	 * @return Returns the level of the service. Refers to {@link Level} to
	 *         check valid values.
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * @return Returns the subscription type of the service. Refers to
	 *         {@link SubscriptionType} to check valid values.
	 */
	public String getSubscriptionType() {
		return subscriptionType;
	}

	/**
	 * @return Returns the version of the service
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @return Returns the edition of the service
	 */
	public String getEdition() {
		return edition;
	}

	/**
	 * @return Returns the description of the service
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return Retuns the shape of the service. Refer to {@link Shape} to check
	 *         valid values.
	 */
	public String getShape() {
		return shape;
	}

	/**
	 * @return Returns the ssh public key name configured to the service
	 */
	public String getSshPublicKeyNamed() {
		return sshPublicKeyNamed;
	}

	/**
	 * @return Returns the ssh public key as text configured to the service
	 */
	public String getSshPublicKeyText() {
		return sshPublicKeyText;
	}

	/**
	 * @param level
	 *            the level of the service. Refers to {@link Level} to check
	 *            valid values.
	 */
	public void setLevel(String level) {
		this.level = level;
	}

	/**
	 * @param subscriptionType
	 *            the subscription type of the service. Refers to
	 *            {@link SubscriptionType} to check valid values.
	 */
	public void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
	}

	/**
	 * @param version
	 *            the version of the service
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * @param edition
	 *            the edition of the service, as EE, for example
	 */
	public void setEdition(String edition) {
		this.edition = edition;
	}

	/**
	 * @param description
	 *            the description of the service
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param shape
	 *            the shape of the service. Refers to {@link Shape} to check
	 *            valid values.
	 */
	public void setShape(String shape) {
		this.shape = shape;
	}

	/**
	 * @param sshPublicKeyNamed
	 *            the ssh public key name to the service
	 */
	public void setSshPublicKeyNamed(String sshPublicKeyNamed) {
		this.sshPublicKeyNamed = sshPublicKeyNamed;
	}

	/**
	 * @param sshPublicKeyText
	 *            the ssh public key as text to the service
	 */
	public void setSshPublicKeyText(String sshPublicKeyText) {
		this.sshPublicKeyText = sshPublicKeyText;
	}
}
