package userinfo.dto;

import java.io.Serializable;

public class HolidayDto extends SimpleDto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7132842405848072458L;
	
	private String holidayID;
    private String year;
    private String orgCode;
    private String holidayDate;
    private String holidayNameEN;
    private String holidayNameTH;
    
	public String getHolidayID() {
		return holidayID;
	}
	public void setHolidayID(String holidayID) {
		this.holidayID = holidayID;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getOrgCode() {
		return orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	public String getHolidayDate() {
		return holidayDate;
	}
	public void setHolidayDate(String holidayDate) {
		this.holidayDate = holidayDate;
	}
	public String getHolidayNameEN() {
		return holidayNameEN;
	}
	public void setHolidayNameEN(String holidayNameEN) {
		this.holidayNameEN = holidayNameEN;
	}
	public String getHolidayNameTH() {
		return holidayNameTH;
	}
	public void setHolidayNameTH(String holidayNameTH) {
		this.holidayNameTH = holidayNameTH;
	}      
    
}
