package userinfo.dto;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class LeaveTranDto extends SimpleDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 975532528062590348L;
	
	private String addPeriod;
	private String leaveTypeCode;
	private String createBy;
	private String updateBy;
	private String empNameTH;
	private String remain;
	private String lastBalance;
	private String perioadYear;
	private String empNameEN;
	private String unitCode;
	private String addPeriodByWork;
	private String empCode;	
	private String orgCode;	
	private String requestLeaveNo;
	private String createDtDisplay;
	private String remark;
	private String approveStatus;
	private String leaveRelationCode;
	private String updateDate;
	private String approveCode;
	private String updateDateDisplay;
	private String createDate;
	private String requestLeaveid;
	
	private List<LeaveTransactionDetailDto> tranDetail;
		
	
	public String getRequestLeaveid() {
		return requestLeaveid;
	}
	public void setRequestLeaveid(String requestLeaveid) {
		this.requestLeaveid = requestLeaveid;
	}
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
	public String getAddPeriod() {
		return addPeriod;
	}
	public void setAddPeriod(String addPeriod) {
		this.addPeriod = addPeriod;
	}
	public String getAddPeriodByWork() {
		return addPeriodByWork;
	}
	public void setAddPeriodByWork(String addPeriodByWork) {
		this.addPeriodByWork = addPeriodByWork;
	}
	public String getEmpNameTH() {
		return empNameTH;
	}
	public void setEmpNameTH(String empNameTH) {
		this.empNameTH = empNameTH;
	}
	public String getEmpNameEN() {
		return empNameEN;
	}
	public void setEmpNameEN(String empNameEN) {
		this.empNameEN = empNameEN;
	}
	public String getLastBalance() {
		return lastBalance;
	}
	public void setLastBalance(String lastBalance) {
		this.lastBalance = lastBalance;
	}
	public String getRemain() {
		return remain;
	}
	public void setRemain(String remain) {
		this.remain = remain;
	}
	public String getRequestLeaveNo() {
		return requestLeaveNo;
	}
	public void setRequestLeaveNo(String requestLeaveNo) {
		this.requestLeaveNo = requestLeaveNo;
	}
	public String getCreateDtDisplay() {
		return createDtDisplay;
	}
	public void setCreateDtDisplay(String createDtDisplay) {
		this.createDtDisplay = createDtDisplay;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getApproveStatus() {
		return approveStatus;
	}
	public void setApproveStatus(String approveStatus) {
		this.approveStatus = approveStatus;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public String getApproveCode() {
		return approveCode;
	}
	public void setApproveCode(String approveCode) {
		this.approveCode = approveCode;
	}
	public String getUpdateDateDisplay() {
		return updateDateDisplay;
	}
	public void setUpdateDateDisplay(String updateDateDisplay) {
		this.updateDateDisplay = updateDateDisplay;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public List<LeaveTransactionDetailDto> getTranDetail() {
		return tranDetail;
	}
	public void setTranDetail(List<LeaveTransactionDetailDto> tranDetail) {
		this.tranDetail = tranDetail;
	}
	
	
}
