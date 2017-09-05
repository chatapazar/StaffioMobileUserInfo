package userinfo.dto;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class LeaveReqDto extends SimpleDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 44983580393490986L;

	private String empCode;
	private String orgCode;
	private String unitCode;
	private String leaveTypeCode;
	private String perioadYear;
	private String remark;
	private String leaveRelationCode;
	private String createBy;
	private String updateBy;
	private LeaveTranDto leaveTranDto;
	private List<LeaveTransactionDetailDto> leavetransaction;
	private String requestLeaveNo;
	private String crateDtDisplay;
	private String approvedStatus;
	private String updateDt;
	private String approveCode;
	private String requestLeaveId;
	
	
	
	public String getEmpCode() {
		return empCode;
	}
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}
	public String getOrgCode() {
		return orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	public String getUnitCode() {
		return unitCode;
	}
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}
	public String getLeaveTypeCode() {
		return leaveTypeCode;
	}
	public void setLeaveTypeCode(String leaveTypeCode) {
		this.leaveTypeCode = leaveTypeCode;
	}
	public String getPerioadYear() {
		return perioadYear;
	}
	public void setPerioadYear(String perioadYear) {
		this.perioadYear = perioadYear;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getLeaveRelationCode() {
		return leaveRelationCode;
	}
	public void setLeaveRelationCode(String leaveRelationCode) {
		this.leaveRelationCode = leaveRelationCode;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public LeaveTranDto getLeaveTranDto() {
		return leaveTranDto;
	}
	public void setLeaveTranDto(LeaveTranDto leaveTranDto) {
		this.leaveTranDto = leaveTranDto;
	}
	public List<LeaveTransactionDetailDto> getLeavetransaction() {
		return leavetransaction;
	}
	public void setLeavetransaction(List<LeaveTransactionDetailDto> leavetransaction) {
		this.leavetransaction = leavetransaction;
	}
	public String getRequestLeaveNo() {
		return requestLeaveNo;
	}
	public void setRequestLeaveNo(String requestLeaveNo) {
		this.requestLeaveNo = requestLeaveNo;
	}
	public String getCrateDtDisplay() {
		return crateDtDisplay;
	}
	public void setCrateDtDisplay(String crateDtDisplay) {
		this.crateDtDisplay = crateDtDisplay;
	}
	public String getApprovedStatus() {
		return approvedStatus;
	}
	public void setApprovedStatus(String approvedStatus) {
		this.approvedStatus = approvedStatus;
	}
	public String getUpdateDt() {
		return updateDt;
	}
	public void setUpdateDt(String updateDt) {
		this.updateDt = updateDt;
	}
	public String getApproveCode() {
		return approveCode;
	}
	public void setApproveCode(String approveCode) {
		this.approveCode = approveCode;
	}
	public String getRequestLeaveId() {
		return requestLeaveId;
	}
	public void setRequestLeaveId(String requestLeaveId) {
		this.requestLeaveId = requestLeaveId;
	}
	
	
	
}
