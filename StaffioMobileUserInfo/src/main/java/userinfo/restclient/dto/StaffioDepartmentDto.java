package userinfo.restclient.dto;

import java.io.Serializable;

public class StaffioDepartmentDto  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7015803299851034078L;
	
	private String CompanyID;
	private String orgDisplay;
	private String UnitCode;
	private String shortName;
	private String orgNameEN;

	public String getCompanyID() {
		return CompanyID;
	}

	public void setCompanyID(String CompanyID) {
		this.CompanyID = CompanyID;
	}

	public String getOrgDisplay() {
		return orgDisplay;
	}

	public void setOrgDisplay(String orgDisplay) {
		this.orgDisplay = orgDisplay;
	}

	public String getUnitCode() {
		return UnitCode;
	}

	public void setUnitCode(String UnitCode) {
		this.UnitCode = UnitCode;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getOrgNameEN() {
		return orgNameEN;
	}

	public void setOrgNameEN(String orgNameEN) {
		this.orgNameEN = orgNameEN;
	}
}
