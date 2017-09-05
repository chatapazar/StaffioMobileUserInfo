package userinfo.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import org.springframework.stereotype.Component;

public class PersonalDto extends SimpleDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2456085003998247359L;
	
	private BigDecimal userID;
	private String personalID;
	private String employeeCode;
	private String titleNameCode;
	private String titleNameTH;
	private String titleNameEN;
	private String fullNameTH;
	private String fullNameEN;
	private String orgCode;
	private String positionName;
	private String unitCode;
	private String username;
	private String password;
	private String touchID;
	private String pin;
	private String deviceID;
	private String leaderCode;
	
	
	private DepartmentDto depDto;
		
	
	public BigDecimal getUserID() {
		return userID;
	}
	public void setUserID(BigDecimal userID) {
		this.userID = userID;
	}
	public String getPersonalID() {
		return personalID;
	}
	public void setPersonalID(String personalID) {
		this.personalID = personalID;
	}
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	public String getTitleNameCode() {
		return titleNameCode;
	}
	public void setTitleNameCode(String titleNameCode) {
		this.titleNameCode = titleNameCode;
	}
	public String getFullNameTH() {
		return fullNameTH;
	}
	public void setFullNameTH(String fullNameTH) {
		this.fullNameTH = fullNameTH;
	}
	public String getFullNameEN() {
		return fullNameEN;
	}
	public void setFullNameEN(String fullNameEN) {
		this.fullNameEN = fullNameEN;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getTouchID() {
		return touchID;
	}
	public void setTouchID(String touchID) {
		this.touchID = touchID;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getTitleNameTH() {
		return titleNameTH;
	}
	public void setTitleNameTH(String titleNameTH) {
		this.titleNameTH = titleNameTH;
	}
	public String getTitleNameEN() {
		return titleNameEN;
	}
	public void setTitleNameEN(String titleNameEN) {
		this.titleNameEN = titleNameEN;
	}
	public DepartmentDto getDepDto() {
		return depDto;
	}
	public void setDepDto(DepartmentDto depDto) {
		this.depDto = depDto;
	}
	public String getPositionName() {
		return positionName;
	}
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	public String getDeviceID() {
		return deviceID;
	}
	public void setDeviceID(String deviceId) {
		this.deviceID = deviceId;
	}
	public String getLeaderCode() {
		return leaderCode;
	}
	public void setLeaderCode(String leaderCode) {
		this.leaderCode = leaderCode;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

		
}
