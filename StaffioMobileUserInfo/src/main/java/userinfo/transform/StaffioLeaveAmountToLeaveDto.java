package userinfo.transform;

import java.util.ArrayList;
import java.util.List;

import userinfo.dto.LeaveAmountDto;
import userinfo.restclient.dto.StaffioLeaveDto;

public class StaffioLeaveAmountToLeaveDto {
	public static LeaveAmountDto transform(StaffioLeaveDto staffio) {	
		LeaveAmountDto dto = new LeaveAmountDto();
		dto.setLeaveType(staffio.getLeaveTypeCode());
		dto.setLeaveAmount(staffio.getLeaveAmount());
		return dto;		
	}
	
	public static List<LeaveAmountDto> transform(List<StaffioLeaveDto> staffios) {
		List<LeaveAmountDto> list= new ArrayList<LeaveAmountDto>();
		for(StaffioLeaveDto staffio : staffios) {
			list.add(transform(staffio));
		}
		return list;		
	}
}
