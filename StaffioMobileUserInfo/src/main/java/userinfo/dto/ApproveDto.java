package userinfo.dto;

import java.io.Serializable;

public class ApproveDto extends SimpleDto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8313307917155437024L;
	
	private String approveBy;
	private String leaveType;
	private String empCode;
	
	public String getApproveBy() {
		return approveBy;
	}
	public void setApproveBy(String approveBy) {
		this.approveBy = approveBy;
	}
	public String getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	public String getEmpCode() {
		return empCode;
	}
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}
	
	
}
