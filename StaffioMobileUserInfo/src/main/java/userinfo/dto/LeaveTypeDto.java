package userinfo.dto;

import java.io.Serializable;

public class LeaveTypeDto extends SimpleDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7681226578028065307L;
	
	private String leaveTypeID;
	private String leaveTypeCode;
	private String leaveTypeNameEN;
	private String leaveTypeNameTH;
	private String maxOfLeave;
	private String maxDayOfLeave;
	private String leaveHourMin;
	private String requestReason;
	private String requestDocument;
	private String requestDocumenType;
	private String dayOfSentDocument;
	private String remark;
	public String getLeaveTypeID() {
		return leaveTypeID;
	}
	public void setLeaveTypeID(String leaveTypeID) {
		this.leaveTypeID = leaveTypeID;
	}
	public String getLeaveTypeCode() {
		return leaveTypeCode;
	}
	public void setLeaveTypeCode(String leaveTypeCode) {
		this.leaveTypeCode = leaveTypeCode;
	}
	public String getLeaveTypeNameEN() {
		return leaveTypeNameEN;
	}
	public void setLeaveTypeNameEN(String leaveTypeNameEN) {
		this.leaveTypeNameEN = leaveTypeNameEN;
	}
	public String getLeaveTypeNameTH() {
		return leaveTypeNameTH;
	}
	public void setLeaveTypeNameTH(String leaveTypeNameTH) {
		this.leaveTypeNameTH = leaveTypeNameTH;
	}
	public String getMaxOfLeave() {
		return maxOfLeave;
	}
	public void setMaxOfLeave(String maxOfLeave) {
		this.maxOfLeave = maxOfLeave;
	}
	public String getMaxDayOfLeave() {
		return maxDayOfLeave;
	}
	public void setMaxDayOfLeave(String maxDayOfLeave) {
		this.maxDayOfLeave = maxDayOfLeave;
	}
	public String getLeaveHourMin() {
		return leaveHourMin;
	}
	public void setLeaveHourMin(String leaveHourMin) {
		this.leaveHourMin = leaveHourMin;
	}
	public String getRequestReason() {
		return requestReason;
	}
	public void setRequestReason(String requestReason) {
		this.requestReason = requestReason;
	}
	public String getRequestDocument() {
		return requestDocument;
	}
	public void setRequestDocument(String requestDocument) {
		this.requestDocument = requestDocument;
	}
	public String getRequestDocumenType() {
		return requestDocumenType;
	}
	public void setRequestDocumenType(String requestDocumenType) {
		this.requestDocumenType = requestDocumenType;
	}
	public String getDayOfSentDocument() {
		return dayOfSentDocument;
	}
	public void setDayOfSentDocument(String dayOfSentDocument) {
		this.dayOfSentDocument = dayOfSentDocument;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	

}
