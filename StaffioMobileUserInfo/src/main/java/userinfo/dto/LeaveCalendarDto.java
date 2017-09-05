package userinfo.dto;

import java.io.Serializable;

public class LeaveCalendarDto extends SimpleDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4793282311230214458L;

	private String requestLeaveNo;
    private String id;
    private String startDate;
    private String endDate;
    private String approveStatus;
    private String title;
    private String color;
    
	public String getRequestLeaveNo() {
		return requestLeaveNo;
	}
	public void setRequestLeaveNo(String requestLeaveNo) {
		this.requestLeaveNo = requestLeaveNo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getApproveStatus() {
		return approveStatus;
	}
	public void setApproveStatus(String approveStatus) {
		this.approveStatus = approveStatus;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	} 
}
