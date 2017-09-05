package userinfo.restclient.dto;

import java.io.Serializable;

public class StaffioLeaveDto implements Serializable {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4950167683198799054L;
	
	
	private String LeaveTypeID;
	private String LeaveTypeCode;
	private int LeaveAmount;
	
	public String getLeaveTypeID() {
		return LeaveTypeID;
	}
	public void setLeaveTypeID(String leaveTypeID) {
		LeaveTypeID = leaveTypeID;
	}
	public String getLeaveTypeCode() {
		return LeaveTypeCode;
	}
	public void setLeaveTypeCode(String leaveTypeCode) {
		LeaveTypeCode = leaveTypeCode;
	}
	public int getLeaveAmount() {
		return LeaveAmount;
	}
	public void setLeaveAmount(int leaveAmount) {
		LeaveAmount = leaveAmount;
	}
	
	
}
