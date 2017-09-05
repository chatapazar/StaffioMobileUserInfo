package userinfo.transform;

import java.util.ArrayList;
import java.util.List;

import userinfo.dto.TitleDto;
import userinfo.restclient.dto.StaffioTitleDto;

public class StaffioTitleToTitle {

	public static TitleDto transform(StaffioTitleDto staffio) {
		TitleDto title = new TitleDto();
		title.setTitleNo(staffio.getTitleNamNo());
		title.setTitleEN(staffio.getTitleEn());
		title.setTitleTH(staffio.getTitleTh());
		return title;
	}
	
	public static List<TitleDto> transform(List<StaffioTitleDto> staffioList) {
		List <TitleDto> list = new ArrayList<TitleDto>();
		for(StaffioTitleDto staffio : staffioList) {
			list.add(transform(staffio));
		}		
		return list;
	}
}
