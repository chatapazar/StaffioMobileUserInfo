package userinfo.transform;

import java.util.ArrayList;
import java.util.List;

import userinfo.dto.HolidayDto;
import userinfo.restclient.dto.StaffioHolidayDto;

public class StaffioHolidayToHolidayDto {
	public static HolidayDto transform(StaffioHolidayDto staffio) {	
		HolidayDto dto = new HolidayDto();
		dto.setHolidayID(staffio.getHOLIDAY_ID());
		dto.setOrgCode(staffio.getORG_CODE());
		dto.setYear(staffio.getYEAR());
		dto.setHolidayDate(staffio.getHOLIDAY_DATE());
		dto.setHolidayNameEN(staffio.getHOLIDAY_NAME_EN());
		dto.setHolidayNameTH(staffio.getHOLIDAY_NAME_TH());
		return dto;		
	}
	
	public static List<HolidayDto> transform(List<StaffioHolidayDto> staffios) {
		List<HolidayDto> list= new ArrayList<HolidayDto>();
		for(StaffioHolidayDto staffio : staffios) {
			list.add(transform(staffio));
		}
		return list;		
	}
}
