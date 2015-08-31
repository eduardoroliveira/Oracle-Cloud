package com.oracle.cloud.core.beans;

/**
 * This class contains the fields used in the returning messages received from
 * executions as delete, scale up, stop, start, etc..
 * 
 * @author eduardo.r.oliveira@oracle.com
 *
 */
public class ManageStatus {
	private String code;
	private String status;
	private String message;
	private String additionalInfo;

	/**
	 * @return Returns the error responded by an execution delete, scale up,
	 *         etc.
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @return Returns the status responded by the execution
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @return Returns the execution message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param code
	 *            the response code
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @param status
	 *            the response status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @param message
	 *            the response message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return Returns additional info as error detailed message
	 */
	public String getAdditionalInfo() {
		return additionalInfo;
	}

	/**
	 * @param additionalInfo
	 *            additional info as error detailed message
	 */
	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("code[").append(code).append("], ");
		sb.append("status[").append(status).append("], ");
		sb.append("message[").append(message).append("], ");
		sb.append("additionalInfo[").append(additionalInfo).append("]");
		return sb.toString();
	}
}
