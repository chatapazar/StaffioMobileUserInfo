package userinfo.dto;

import java.io.Serializable;

public class LeaveTransactionDetailDto extends SimpleDto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3748378137472780680L;

	private String id;
	private String leaveTypeCode;
	private String empCode;
	private String startDate;
	private String startTime;
	private String endDate;
	private String endTime;
	private String leaveReason;
	private String leavePeriod;
	private String leaveMinute;
	private String effectiveDate;
	private String hours;
	private String minutes;
	private String createBy;
	private String updateBy;	
	private String periodYear;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLeaveTypeCode() {
		return leaveTypeCode;
	}
	public void setLeaveTypeCode(String leaveTypeCode) {
		this.leaveTypeCode = leaveTypeCode;
	}
	public String getEmpCode() {
		return empCode;
	}
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getLeaveReason() {
		return leaveReason;
	}
	public void setLeaveReason(String leaveReason) {
		this.leaveReason = leaveReason;
	}

	public String getLeavePeriod() {
		return leavePeriod;
	}
	public void setLeavePeriod(String leavePeriod) {
		this.leavePeriod = leavePeriod;
	}
	public String getLeaveMinute() {
		return leaveMinute;
	}
	public void setLeaveMinute(String leaveMinute) {
		this.leaveMinute = leaveMinute;
	}
	public String getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public String getHours() {
		return hours;
	}
	public void setHours(String hours) {
		this.hours = hours;
	}
	public String getMinutes() {
		return minutes;
	}
	public void setMinutes(String minutes) {
		this.minutes = minutes;
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
	public String getPeriodYear() {
		return periodYear;
	}
	public void setPeriodYear(String periodYear) {
		this.periodYear = periodYear;
	}
	
	
}
