package com.oracle.cloud.dbcs.beans;

import com.oracle.cloud.core.beans.CloudEnvCreationParams;

/**
 * This class contains the fields to create an Oracle DBCS Service.
 * 
 * @author eduardo.r.oliveira@oracle.com
 *
 */
public class DBCSEnvCreationParams extends CloudEnvCreationParams {
	/**
	 * Contains the keys to handle the fields of this class
	 */
	public interface Keys extends CloudEnvCreationParams.Keys {
		public static final String USABLE_STORAGE = "usableStorage";
		public static final String SID = "sid";
		public static final String PDB_NAME = "pdbName";
		public static final String FAILOVER_DATABASE = "failoverDatabase";
		public static final String BACKUP_DESTINATION = "backupDestination";
		public static final String PARAMETERS = "parameters";
	}

	/**
	 * The default value for type field. This is the single valid value today.
	 */
	public static final String DEFAULT_TYPE_DB = "db";

	/**
	 * The default value for failoverDatabase field. This is the single valid
	 * value today.
	 */
	public static final String DEFAULT_FAILOVER_DATABASE = "no";

	/**
	 * The valid values for edition field
	 */
	public interface Edition {
		public final static String STANDARD_EDITION_ONE = "SE1";
		public final static String ENTERPRISE_EDITION = "EE";
		public final static String ENTERPRISE_EDITION_HIGH_PERFORMANCE = "EE_HP";
		public final static String ENTERPRISE_EDITION_EXTREME_PERFORMANCE = "EE_EP";
	}

	/**
	 * Valid values for version field.
	 */
	public interface Version {
		public final static String VERSION_11_2_0_4 = "11.2.0.4";
		public final static String VERSION_12_1_0_2 = "12.1.0.2";
	}

	/**
	 * Valid backupDestination field values.
	 */
	public enum BackupDestination {
		NONE, DISK, BOTH
	}

	private String usableStorage;
	private String sid;
	private String pdbName;
	private String failoverDatabase = DEFAULT_FAILOVER_DATABASE;
	private String backupDestination;

	/**
	 * @return Returns the space allocated in the block storage for data
	 *         partition
	 */
	public String getUsableStorage() {
		return usableStorage;
	}

	/**
	 * @param usableStorage
	 *            the space allocated in the block storage for data partition
	 */
	public void setUsableStorage(String usableStorage) {
		this.usableStorage = usableStorage;
	}

	/**
	 * @return Returns the SID (Service ID) from database
	 */
	public String getSid() {
		return sid;
	}

	/**
	 * @param sid
	 *            the SID (Service ID) from database
	 */
	public void setSid(String sid) {
		this.sid = sid;
	}

	/**
	 * @return Returns the pdb (pluggable database) name from database
	 */
	public String getPdbName() {
		return pdbName;
	}

	/**
	 * @param pdbName
	 *            the pdb (pluggable database) name from database
	 */
	public void setPdbName(String pdbName) {
		this.pdbName = pdbName;
	}

	/**
	 * @return Returns yes or no if the database is configured as failover
	 */
	public String getFailoverDatabase() {
		return failoverDatabase;
	}

	/**
	 * @param failoverDatabase
	 *            yes or no if the database is configured as failover. The only
	 *            valid value today is no. 
	 */
	public void setFailoverDatabase(String failoverDatabase) {
		this.failoverDatabase = failoverDatabase;
	}

	/**
	 * @return Returns the backup destination, that can be NONE - for non
	 *         backup, DISK - for local backup and BOTH - for local and Oracle
	 *         Storage Service backup.
	 */
	public String getBackupDestination() {
		return backupDestination;
	}

	/**
	 * @param backupDestination
	 *            backup destination, that can be NONE - for non backup, DISK -
	 *            for local backup and BOTH - for local and Oracle Storage
	 *            Service backup. Refers to {@link BackupDestination} Enum.
	 */
	public void setBackupDestination(String backupDestination) {
		this.backupDestination = backupDestination;
	}
}
