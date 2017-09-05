package userinfo.transform;

import java.util.ArrayList;
import java.util.List;

import userinfo.dto.DepartmentDto;
import userinfo.restclient.dto.StaffioDepartmentDto;

public class StaffioDepartmentToDepartment {

	public static DepartmentDto transform(StaffioDepartmentDto staffio) {
		DepartmentDto dto = new DepartmentDto();
		dto.setUnitCode(staffio.getUnitCode());
		dto.setCompanyID(staffio.getCompanyID());
		dto.setOrgDisplay(staffio.getOrgDisplay());		
		dto.setOrgNameEN(staffio.getOrgNameEN());
		dto.setOrgShortName(staffio.getShortName());
		return dto;
	}
	
	public static List<DepartmentDto> transform(List<StaffioDepartmentDto> staffioList) {
		List <DepartmentDto> list = new ArrayList<DepartmentDto>();
		
		for(StaffioDepartmentDto staffio : staffioList) {
			list.add(transform(staffio));
		}		
		return list;
	}
}
