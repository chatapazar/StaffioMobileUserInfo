package userinfo.restclient.dto;

import java.io.Serializable;

public class LeaveReq implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2822034825851479988L;
	private String LEAVE_TYPE_CODE;
	private String CREATED_BY;
	private String LEAVE_RELATION_CODE;
	private String UPDATED_BY;
	private String REMARK;
	private String PERIOD_YEAR;
	private String EMP_UNIT_CODE;
	private String EMP_CODE;
	private String EMP_COMPANY_CODE;
	
	private ListLeaveReqDetail ListLeaveRequestDetail;
	private String REQUEST_LEAVE_NO;
	private String CREATED_DT_DISPLAY;
	private String APPROVED_STATUS;
	private String UPDATED_DT;
	private String APPROVE_CODE;	    
    private String REQUEST_LEAVE_ID;

	public String getLEAVE_TYPE_CODE() {
		return LEAVE_TYPE_CODE;
	}

	public void setLEAVE_TYPE_CODE(String lEAVE_TYPE_CODE) {
		LEAVE_TYPE_CODE = lEAVE_TYPE_CODE;
	}

	public String getCREATED_BY() {
		return CREATED_BY;
	}

	public void setCREATED_BY(String cREATED_BY) {
		CREATED_BY = cREATED_BY;
	}

	public String getLEAVE_RELATION_CODE() {
		return LEAVE_RELATION_CODE;
	}

	public void setLEAVE_RELATION_CODE(String lEAVE_RELATION_CODE) {
		LEAVE_RELATION_CODE = lEAVE_RELATION_CODE;
	}

	public String getUPDATED_BY() {
		return UPDATED_BY;
	}

	public void setUPDATED_BY(String uPDATED_BY) {
		UPDATED_BY = uPDATED_BY;
	}

	public String getREMARK() {
		return REMARK;
	}

	public void setREMARK(String rEMARK) {
		REMARK = rEMARK;
	}

	public String getPERIOD_YEAR() {
		return PERIOD_YEAR;
	}

	public void setPERIOD_YEAR(String pERIOD_YEAR) {
		PERIOD_YEAR = pERIOD_YEAR;
	}

	public String getEMP_UNIT_CODE() {
		return EMP_UNIT_CODE;
	}

	public void setEMP_UNIT_CODE(String eMP_UNIT_CODE) {
		EMP_UNIT_CODE = eMP_UNIT_CODE;
	}

	public String getEMP_CODE() {
		return EMP_CODE;
	}

	public void setEMP_CODE(String eMP_CODE) {
		EMP_CODE = eMP_CODE;
	}

	public String getEMP_COMPANY_CODE() {
		return EMP_COMPANY_CODE;
	}

	public void setEMP_COMPANY_CODE(String eMP_COMPANY_CODE) {
		EMP_COMPANY_CODE = eMP_COMPANY_CODE;
	}

	public ListLeaveReqDetail getListLeaveRequestDetail() {
		return ListLeaveRequestDetail;
	}

	public void setListLeaveRequestDetail(ListLeaveReqDetail listLeaveRequestDetail) {
		ListLeaveRequestDetail = listLeaveRequestDetail;
	}

	public String getREQUEST_LEAVE_NO() {
		return REQUEST_LEAVE_NO;
	}

	public void setREQUEST_LEAVE_NO(String rEQUEST_LEAVE_NO) {
		REQUEST_LEAVE_NO = rEQUEST_LEAVE_NO;
	}

	public String getCREATED_DT_DISPLAY() {
		return CREATED_DT_DISPLAY;
	}

	public void setCREATED_DT_DISPLAY(String cREATED_DT_DISPLAY) {
		CREATED_DT_DISPLAY = cREATED_DT_DISPLAY;
	}

	public String getAPPROVED_STATUS() {
		return APPROVED_STATUS;
	}

	public void setAPPROVED_STATUS(String aPPROVED_STATUS) {
		APPROVED_STATUS = aPPROVED_STATUS;
	}

	public String getUPDATED_DT() {
		return UPDATED_DT;
	}

	public void setUPDATED_DT(String uPDATED_DT) {
		UPDATED_DT = uPDATED_DT;
	}

	public String getAPPROVE_CODE() {
		return APPROVE_CODE;
	}

	public void setAPPROVE_CODE(String aPPROVE_CODE) {
		APPROVE_CODE = aPPROVE_CODE;
	}

	public String getREQUEST_LEAVE_ID() {
		return REQUEST_LEAVE_ID;
	}

	public void setREQUEST_LEAVE_ID(String rEQUEST_LEAVE_ID) {
		REQUEST_LEAVE_ID = rEQUEST_LEAVE_ID;
	}

}
