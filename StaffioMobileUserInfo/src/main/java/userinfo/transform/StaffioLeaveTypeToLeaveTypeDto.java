package userinfo.transform;

import java.util.ArrayList;
import java.util.List;

import userinfo.dto.LeaveTypeDto;
import userinfo.restclient.dto.StaffioLeaveTypeDto;

public class StaffioLeaveTypeToLeaveTypeDto {
	public static LeaveTypeDto transform(StaffioLeaveTypeDto staffio) {
		LeaveTypeDto dto = new LeaveTypeDto();
		dto.setLeaveTypeID(staffio.getLEAVE_GROUP_ID());
		dto.setLeaveTypeCode(staffio.getLEAVE_GROUP_CODE());
		dto.setLeaveTypeNameEN(staffio.getLEAVE_GROUP_NAME_EN());
		dto.setLeaveTypeNameTH(staffio.getLEAVE_GROUP_NAME_TH());
		dto.setMaxOfLeave(staffio.getMAX_OF_LEAVE());
		dto.setMaxDayOfLeave(staffio.getMAX_DAY_OF_LEAVE());
		dto.setLeaveHourMin(staffio.getLEAVE_HOURS_MIN());
		dto.setRequestReason(staffio.getREQUEST_REASON());
		dto.setRequestDocument(staffio.getREQUEST_DOCUMENT());
		dto.setRequestDocumenType(staffio.getREQUEST_DOCUMENT_TYPE());
		dto.setDayOfSentDocument(staffio.getDAY_OF_SEND_DOCUMENT());
		dto.setRemark(staffio.getREMARK());
		return dto;
	}
	
	public static List<LeaveTypeDto> transform(List<StaffioLeaveTypeDto> staffioList) {
		List <LeaveTypeDto> list = new ArrayList<LeaveTypeDto>();
		for(StaffioLeaveTypeDto staffio : staffioList) {
			list.add(transform(staffio));
		}		
		return list;
	}
}
