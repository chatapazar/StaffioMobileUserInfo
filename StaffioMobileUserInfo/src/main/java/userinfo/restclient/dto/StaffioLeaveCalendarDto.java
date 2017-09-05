package userinfo.restclient.dto;

import java.io.Serializable;

public class StaffioLeaveCalendarDto implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 6662069472492193287L;

	private String RequestLeaveNo;
    private String eStartDate;
    private String eRequestLeaveNo;
    private String eApproveStatus;
    private String eId;
    private String eEndDate;
    private String eTitle;
    private String eColor;
    
	public String getRequestLeaveNo() {
		return RequestLeaveNo;
	}
	public void setRequestLeaveNo(String requestLeaveNo) {
		RequestLeaveNo = requestLeaveNo;
	}
	public String geteStartDate() {
		return eStartDate;
	}
	public void seteStartDate(String eStartDate) {
		this.eStartDate = eStartDate;
	}
	public String geteRequestLeaveNo() {
		return eRequestLeaveNo;
	}
	public void seteRequestLeaveNo(String eRequestLeaveNo) {
		this.eRequestLeaveNo = eRequestLeaveNo;
	}
	public String geteApproveStatus() {
		return eApproveStatus;
	}
	public void seteApproveStatus(String eApproveStatus) {
		this.eApproveStatus = eApproveStatus;
	}
	public String geteId() {
		return eId;
	}
	public void seteId(String eId) {
		this.eId = eId;
	}
	public String geteEndDate() {
		return eEndDate;
	}
	public void seteEndDate(String eEndDate) {
		this.eEndDate = eEndDate;
	}
	public String geteTitle() {
		return eTitle;
	}
	public void seteTitle(String eTitle) {
		this.eTitle = eTitle;
	}
	public String geteColor() {
		return eColor;
	}
	public void seteColor(String eColor) {
		this.eColor = eColor;
	}

    
    
}
