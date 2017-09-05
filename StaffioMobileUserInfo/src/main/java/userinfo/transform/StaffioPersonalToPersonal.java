package userinfo.transform;

import java.math.BigDecimal;

import userinfo.dto.PersonalDto;
import userinfo.restclient.dto.StaffioPersonalDto;

public class StaffioPersonalToPersonal {
	public static PersonalDto transform(StaffioPersonalDto staffio) {
		PersonalDto personal = new PersonalDto();
		//personal.setUserID(staffio.getPERSONAL_ID());
		personal.setPersonalID(staffio.getPERSONAL_ID());
		personal.setEmployeeCode(staffio.getEMP_CODE());
		personal.setTitleNameCode(staffio.getTITLE_NAME_CODE());
		personal.setFullNameEN(staffio.getFULL_NAME_EN());
		personal.setFullNameTH(staffio.getFULL_NAME_TH());
		personal.setOrgCode(staffio.getORG_CODE());
		personal.setUnitCode(staffio.getUNIT_CODE());
		personal.setPositionName(staffio.getPOSITION_NAME());
		personal.setLeaderCode(staffio.getLEADER_CODE());
		return personal;
	}
}
