package userinfo.dto;

import java.io.Serializable;

public class LeaveAmountDto extends SimpleDto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5592772444277269728L;
	
	private String leaveType;
	private int leaveAmount;
	public String getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	public int getLeaveAmount() {
		return leaveAmount;
	}
	public void setLeaveAmount(int leaveAmount) {
		this.leaveAmount = leaveAmount;
	}
	
	
}
