package userinfo.restclient.dto;

import java.io.Serializable;

public class StaffioLeaveTransactionDetail implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1227108496713712595L;

	private String MINUTES;
	private String LEAVE_TYPE_CODE;
	private String EFFECTIVE_DATE;
	private String LEAVE_REASON;
	private String END_DATE;
	private String START_TIME;
	private String EMP_CODE;
	private String id;
	private String START_DATE;
	private String CREATED_BY;
	private String LEAVE_MINUTE;
	private String LEAVE_ACTION;
	private String UPDATED_BY;
	private String PERIOD_YEAR;
	private String END_TIME;
	private String HOURS;
	
	public String getMINUTES() {
		return MINUTES;
	}
	public void setMINUTES(String mINUTES) {
		MINUTES = mINUTES;
	}
	public String getLEAVE_TYPE_CODE() {
		return LEAVE_TYPE_CODE;
	}
	public void setLEAVE_TYPE_CODE(String lEAVE_TYPE_CODE) {
		LEAVE_TYPE_CODE = lEAVE_TYPE_CODE;
	}
	public String getEFFECTIVE_DATE() {
		return EFFECTIVE_DATE;
	}
	public void setEFFECTIVE_DATE(String eFFECTIVE_DATE) {
		EFFECTIVE_DATE = eFFECTIVE_DATE;
	}
	public String getLEAVE_REASON() {
		return LEAVE_REASON;
	}
	public void setLEAVE_REASON(String lEAVE_REASON) {
		LEAVE_REASON = lEAVE_REASON;
	}
	public String getEND_DATE() {
		return END_DATE;
	}
	public void setEND_DATE(String eND_DATE) {
		END_DATE = eND_DATE;
	}
	public String getSTART_TIME() {
		return START_TIME;
	}
	public void setSTART_TIME(String sTART_TIME) {
		START_TIME = sTART_TIME;
	}
	public String getEMP_CODE() {
		return EMP_CODE;
	}
	public void setEMP_CODE(String eMP_CODE) {
		EMP_CODE = eMP_CODE;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSTART_DATE() {
		return START_DATE;
	}
	public void setSTART_DATE(String sTART_DATE) {
		START_DATE = sTART_DATE;
	}
	public String getCREATED_BY() {
		return CREATED_BY;
	}
	public void setCREATED_BY(String cREATED_BY) {
		CREATED_BY = cREATED_BY;
	}
	public String getLEAVE_MINUTE() {
		return LEAVE_MINUTE;
	}
	public void setLEAVE_MINUTE(String lEAVE_MINUTE) {
		LEAVE_MINUTE = lEAVE_MINUTE;
	}
	public String getLEAVE_ACTION() {
		return LEAVE_ACTION;
	}
	public void setLEAVE_ACTION(String lEAVE_ACTION) {
		LEAVE_ACTION = lEAVE_ACTION;
	}
	public String getUPDATED_BY() {
		return UPDATED_BY;
	}
	public void setUPDATED_BY(String uPDATED_BY) {
		UPDATED_BY = uPDATED_BY;
	}
	public String getPERIOD_YEAR() {
		return PERIOD_YEAR;
	}
	public void setPERIOD_YEAR(String pERIOD_YEAR) {
		PERIOD_YEAR = pERIOD_YEAR;
	}
	public String getEND_TIME() {
		return END_TIME;
	}
	public void setEND_TIME(String eND_TIME) {
		END_TIME = eND_TIME;
	}
	public String getHOURS() {
		return HOURS;
	}
	public void setHOURS(String hOURS) {
		HOURS = hOURS;
	}
	
	
}
