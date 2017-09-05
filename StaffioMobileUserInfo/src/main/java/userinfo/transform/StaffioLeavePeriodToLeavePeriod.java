package userinfo.transform;

import java.util.ArrayList;
import java.util.List;

import userinfo.dto.LeavePeriodDto;
import userinfo.restclient.dto.StaffioLeavePeriodDto;

public class StaffioLeavePeriodToLeavePeriod {
	public static LeavePeriodDto transform(StaffioLeavePeriodDto staffio) {
		LeavePeriodDto dto = new LeavePeriodDto();
		dto.setId(staffio.getId());
		dto.setTitleTH(staffio.getTitle());
		dto.setTitleEN(staffio.getTitle_EN());
		dto.setData(staffio.getDATA1());
		return dto;
	}
	
	public static List<LeavePeriodDto> transform(List<StaffioLeavePeriodDto> staffios){
		List<LeavePeriodDto> list = new ArrayList<LeavePeriodDto>();
		for(StaffioLeavePeriodDto staffio : staffios) {
			list.add(transform(staffio));
		}
		return list;
	}
}
