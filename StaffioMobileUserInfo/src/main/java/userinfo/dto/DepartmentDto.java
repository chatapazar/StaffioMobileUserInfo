package userinfo.dto;

import java.io.Serializable;

public class DepartmentDto extends SimpleDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8589036090927837991L;
	
	private String companyID;
	private String unitCode;
	private String orgNameEN;
	private String orgShortName;
	private String orgDisplay;
	
	public String getCompanyID() {
		return companyID;
	}
	public void setCompanyID(String companyID) {
		this.companyID = companyID;
	}
	public String getUnitCode() {
		return unitCode;
	}
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}
	public String getOrgNameEN() {
		return orgNameEN;
	}
	public void setOrgNameEN(String orgNameEN) {
		this.orgNameEN = orgNameEN;
	}
	public String getOrgShortName() {
		return orgShortName;
	}
	public void setOrgShortName(String orgShortName) {
		this.orgShortName = orgShortName;
	}
	public String getOrgDisplay() {
		return orgDisplay;
	}
	public void setOrgDisplay(String orgDisplay) {
		this.orgDisplay = orgDisplay;
	}
	
	
	
	
	
}
