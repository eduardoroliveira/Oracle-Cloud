package com.oracle.cloud.dbcs.util;

public class DBCSConstants {
	public static final String DBCS_INSTANCES_URL = "https://dbaas.oraclecloud.com/paas/service/dbcs/api/v1.1/instances";
	public static final String DBCS_JSON_STOP_SERVICE = "{\"lifecycleState\":\"Stop\"}";
	public static final String DBCS_JSON_START_SERVICE = "{\"lifecycleState\":\"Start\"}";
	public static final String DBCS_JSON_RESTART_SERVICE = "{\"lifecycleState\":\"Restart\"}";
	public static final String DBCS_JSON_SCALE_UP_SHAPE_STORAGE = "'{'\"shape\" :\"{0}\", \"additionalStorage\" :\"{1}\" '}'";
	public static final String DBCS_JSON_SCALE_UP_SHAPE = "'{'\"shape\" :\"{0}\"'}'";
	public static final String DBCS_JSON_SCALE_UP_STORAGE = "'{'\"additionalStorage\" :\"{0}\" '}'";
}
