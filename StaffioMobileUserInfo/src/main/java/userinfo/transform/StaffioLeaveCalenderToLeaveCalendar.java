package userinfo.transform;

import java.util.ArrayList;
import java.util.List;

import userinfo.dto.LeaveCalendarDto;
import userinfo.restclient.dto.StaffioLeaveCalendarDto;

public class StaffioLeaveCalenderToLeaveCalendar {
	public static LeaveCalendarDto transform(StaffioLeaveCalendarDto staffio) {
		LeaveCalendarDto dto = new LeaveCalendarDto();
		dto.setRequestLeaveNo(staffio.getRequestLeaveNo());
		dto.setColor(staffio.geteColor());
		dto.setApproveStatus(staffio.geteApproveStatus());
		dto.setEndDate(staffio.geteEndDate());
		dto.setId(staffio.geteId());
		dto.setStartDate(staffio.geteStartDate());
		dto.setTitle(staffio.geteTitle());	
		return dto;
	}
	
	
	public static List<LeaveCalendarDto> transform(List<StaffioLeaveCalendarDto> staffios){
		List<LeaveCalendarDto> list = new ArrayList<LeaveCalendarDto>();
		for(StaffioLeaveCalendarDto staffio : staffios) {
			list.add(transform(staffio));
		}		
		return list;
	}
}
