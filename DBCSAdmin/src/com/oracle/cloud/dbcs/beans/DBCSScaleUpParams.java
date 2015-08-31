package com.oracle.cloud.dbcs.beans;

import com.oracle.cloud.core.beans.CloudEnvVICreationParams;
import com.oracle.cloud.core.beans.CloudServiceManageParams;

/**
 * This class contains the necessary fields to scale the service up
 * 
 * @author eduardo.r.oliveira@oracle.com
 *
 */
public class DBCSScaleUpParams extends CloudServiceManageParams {
	/**
	 * The valid shapes to be used
	 */
	public interface Shape extends CloudEnvVICreationParams.Shape {
	};

	private String shape;
	private int additionalStorage;

	/**
	 * @return Returns the shape to be used in the scale up process.
	 */
	public String getShape() {
		return shape;
	}

	/**
	 * @param shape
	 *            the shape to be used in the scale up process. Refer to
	 *            {@link Shape} constants to get a valid value.
	 */
	public void setShape(String shape) {
		this.shape = shape;
	}

	/**
	 * @return Returns the additional storage size in GB, to be used in the
	 *         scale up process.
	 */
	public int getAdditionalStorage() {
		return additionalStorage;
	}

	/**
	 * @param additionalStorage
	 *            the additional storage size in GB, to be used in the scale up
	 *            process.
	 */
	public void setAdditionalStorage(int additionalStorage) {
		this.additionalStorage = additionalStorage;
	}
}
