package userinfo.transform;

import java.util.ArrayList;
import java.util.List;

import userinfo.dto.LeaveReqDto;
import userinfo.dto.LeaveTranDto;
import userinfo.dto.LeaveTransactionDetailDto;
import userinfo.restclient.dto.StaffioLeaveTransactionDetail;
import userinfo.restclient.dto.LeaveReq;
import userinfo.restclient.dto.LeaveTran;
import userinfo.restclient.dto.StaffioLeaveTransactionDetail;

public class StaffioLeaveReqToLeaveReq {
	public static LeaveReq transform(LeaveReqDto dto) {
		LeaveReq staffio = new LeaveReq();
		staffio.setCREATED_BY(dto.getCreateBy());
		staffio.setEMP_CODE(dto.getEmpCode());
		staffio.setEMP_COMPANY_CODE(dto.getOrgCode());
		staffio.setEMP_UNIT_CODE(dto.getUnitCode());
		staffio.setLEAVE_RELATION_CODE(dto.getLeaveRelationCode());
		staffio.setLEAVE_TYPE_CODE(dto.getLeaveTypeCode());
		staffio.setPERIOD_YEAR(dto.getPerioadYear());
		staffio.setREMARK(dto.getRemark());
		staffio.setUPDATED_BY(dto.getUpdateBy());
		return staffio;		
	}
	
	public static LeaveTran transform(LeaveTranDto dto) {
		LeaveTran staffio = new LeaveTran();
		staffio.setADD_PERIOD(dto.getAddPeriod());
		staffio.setADD_PERIOD_BY_WORK(dto.getAddPeriodByWork());
		staffio.setCREATED_BY(dto.getCreateBy());
		staffio.setEMP_CODE(dto.getEmpCode());
		staffio.setEMP_COMPANY_CODE(dto.getOrgCode());
		staffio.setEMP_NAME_EN(dto.getEmpNameEN());
		staffio.setEMP_NAME_TH(dto.getEmpNameTH());
		staffio.setEMP_UNIT_CODE(dto.getUnitCode());
		staffio.setLAST_BALANCE(dto.getLastBalance());
		staffio.setLEAVE_TYPE_CODE(dto.getLeaveTypeCode());
		staffio.setPERIOD_YEAR(dto.getPerioadYear());
		staffio.setREMAIN(dto.getRemain());
		staffio.setUPDATED_BY(dto.getUpdateBy());		
		return staffio;
	}
	
	public static StaffioLeaveTransactionDetail transform(LeaveTransactionDetailDto dto) {
		StaffioLeaveTransactionDetail staffio = new StaffioLeaveTransactionDetail();
		staffio.setCREATED_BY(dto.getCreateBy());
		staffio.setEFFECTIVE_DATE(dto.getEffectiveDate());
		staffio.setEMP_CODE(dto.getEmpCode());
		staffio.setEND_DATE(dto.getEndDate());
		staffio.setEND_TIME(dto.getEndTime());
		staffio.setHOURS(dto.getHours());
		staffio.setId(dto.getId());
		staffio.setLEAVE_ACTION(dto.getLeavePeriod());
		staffio.setLEAVE_MINUTE(dto.getLeaveMinute());
		staffio.setLEAVE_REASON(dto.getLeaveReason());
		staffio.setLEAVE_TYPE_CODE(dto.getLeaveTypeCode());
		staffio.setMINUTES(dto.getMinutes());
		staffio.setPERIOD_YEAR(dto.getPeriodYear());
		staffio.setSTART_DATE(dto.getStartDate());
		staffio.setSTART_TIME(dto.getStartTime());
		staffio.setUPDATED_BY(dto.getUpdateBy());		
		return staffio;
	}
	
	public static List<StaffioLeaveTransactionDetail> transfrom(List<LeaveTransactionDetailDto> dtos) {
		List<StaffioLeaveTransactionDetail> list = new ArrayList<StaffioLeaveTransactionDetail>();
		for(LeaveTransactionDetailDto dto : dtos) {
			list.add(transform(dto));
		}
		return list;		
	}
	
	public static LeaveTranDto  transform( LeaveTran staffio) {
		LeaveTranDto dto = new LeaveTranDto();
		dto.setAddPeriod(staffio.getADD_PERIOD());
		dto.setAddPeriodByWork(staffio.getADD_PERIOD_BY_WORK());
		dto.setApproveStatus(staffio.getAPPROVED_STATUS());
		dto.setCreateBy(staffio.getCREATED_BY());
		dto.setCreateDate(staffio.getCREATED_DT());
		dto.setCreateDtDisplay(staffio.getCREATED_DT_DISPLAY());
		dto.setEmpCode(staffio.getEMP_CODE());
		dto.setEmpNameEN(staffio.getEMP_NAME_EN());
		dto.setEmpNameTH(staffio.getEMP_NAME_TH());
		dto.setLastBalance(staffio.getLAST_BALANCE());
		dto.setLeaveRelationCode(staffio.getLEAVE_RELATION_CODE());
		dto.setLeaveTypeCode(staffio.getLEAVE_TYPE_CODE());
		dto.setOrgCode(staffio.getEMP_COMPANY_CODE());
		dto.setUnitCode(staffio.getEMP_UNIT_CODE());
		dto.setPerioadYear(staffio.getPERIOD_YEAR());
		dto.setRemain(staffio.getREMAIN());
		dto.setRemark(staffio.getREMARK());
		dto.setRequestLeaveid(staffio.getREQUEST_LEAVE_ID());
		dto.setRequestLeaveNo(staffio.getREQUEST_LEAVE_NO());
		dto.setUpdateBy(staffio.getUPDATED_BY());
		dto.setUpdateDate(staffio.getUPDATED_DT());
		dto.setUpdateDateDisplay(staffio.getUPDATE_DT_DISPLAY());		
		return dto;
	}
	
	public static LeaveTransactionDetailDto transform(StaffioLeaveTransactionDetail staffio){
		LeaveTransactionDetailDto dto = new LeaveTransactionDetailDto();
		dto.setId(staffio.getId());
		dto.setLeaveTypeCode(staffio.getLEAVE_TYPE_CODE());
		dto.setEmpCode(staffio.getEMP_CODE());
		dto.setStartDate(staffio.getSTART_DATE());
		dto.setStartTime(staffio.getSTART_TIME());
		dto.setEndDate(staffio.getEND_DATE());
		dto.setEndTime(staffio.getEND_TIME());
		dto.setLeaveReason(staffio.getLEAVE_REASON());
		dto.setLeavePeriod(staffio.getLEAVE_ACTION());
		dto.setLeaveMinute(staffio.getLEAVE_MINUTE());
		dto.setEffectiveDate(staffio.getEFFECTIVE_DATE());
		dto.setHours(staffio.getHOURS());
		dto.setMinutes(staffio.getMINUTES());
		dto.setCreateBy(staffio.getCREATED_BY());
		dto.setUpdateBy(staffio.getUPDATED_BY());
		dto.setPeriodYear(staffio.getPERIOD_YEAR());		
		return dto;
	}
	
	public static List<LeaveTransactionDetailDto> transform(List<StaffioLeaveTransactionDetail> staffios){
		List<LeaveTransactionDetailDto> list = new ArrayList<LeaveTransactionDetailDto>();
		for(StaffioLeaveTransactionDetail staffio : staffios) {
			list.add(transform(staffio));
		}
					return list;
	}
	
	public static LeaveReqDto transform(LeaveReq req) {
		LeaveReqDto dto = new LeaveReqDto();
		dto.setEmpCode(req.getEMP_CODE());
		dto.setOrgCode(req.getEMP_COMPANY_CODE());
		dto.setUnitCode(req.getEMP_UNIT_CODE());
		dto.setPerioadYear(req.getPERIOD_YEAR());
		dto.setRemark(req.getREMARK());
		dto.setLeaveRelationCode(req.getLEAVE_RELATION_CODE());
		dto.setCreateBy(req.getCREATED_BY());
		dto.setUpdateBy(req.getUPDATED_BY());
		dto.setRequestLeaveNo(req.getREQUEST_LEAVE_NO());
		dto.setCrateDtDisplay(req.getCREATED_DT_DISPLAY());
		dto.setApprovedStatus(req.getAPPROVED_STATUS());
		dto.setUpdateDt(req.getUPDATED_DT());
		dto.setApproveCode(req.getAPPROVE_CODE());
		dto.setRequestLeaveId(req.getREQUEST_LEAVE_ID());
		if(req.getListLeaveRequestDetail().getListTran().isEmpty()) {
			dto.setLeavetransaction(transform(req.getListLeaveRequestDetail().getListTran()));
		}
		return dto;	
	}

	public static List<LeaveReqDto> transformListLeaveReq(List<LeaveReq> staffios){
		List<LeaveReqDto> list = new ArrayList<LeaveReqDto>();
		for(LeaveReq staffio : staffios) {
			list.add(transform(staffio));
		}
		return list;
	}
	
}
