package userinfo.service;


import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import userinfo.dao.TbPersonalDAO;
import userinfo.dto.PersonalDto;
import userinfo.dto.TitleDto;
import userinfo.restclient.dto.StaffioLoginResultDto;
import userinfo.restclient.dto.StaffioPersonalDto;
import userinfo.transform.StaffioPersonalToPersonal;
import userinfo.utils.CacheUtil;
import userinfo.utils.DataUtils;

@Service
public class LoginService {
	
	@Autowired
	TbPersonalDAO personalDao;
	
	public PersonalDto login(PersonalDto personal) {		
		PersonalDto result = new PersonalDto();;// getUserInfo(personal);
		boolean loginResult = false;
		try {
			if(DataUtils.isNotBlankValue(personal.getPin()) || 
					DataUtils.isNotBlankValue(personal.getTouchID())) {
				if(!personalDao.checkUserByPinCodeOrTouchID(personal)){
					result.setErrorMsg("Try again");
					return result;
				}
				result= getPersonal(personal);
				personalDao.updateDeviceId(personal.getUsername(), personal.getDeviceID());
			}else {		
				
				if(!loginByUserPassword( personal)) {
					result.setErrorMsg("Username/Password Incorrect");
					return result;
				}
				
				result= getPersonal(personal);
				if(DataUtils.isNotBlankValue(result)) {
					result.setUsername(personal.getUsername());
					result.setPassword(personal.getPassword());
					result.setDeviceID(personal.getDeviceID());
					personalDao.insertPersonal(result);
				}
			}

			return result;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return null;
	}
	
	
	private boolean loginByUserPassword(PersonalDto personal) throws Exception {
		String username = "";
		String password = "";
		HttpGet get = null;
		if(personal!= null && DataUtils.isNotBlankValue(personal.getUsername())
			&& DataUtils.isNotBlankValue(personal.getPassword())) {
			username = personal.getUsername();
			password =personal.getPassword();
		}
		String loginURL = "http://45.116.216.131:8080/Staffio_API/api/CheckLogin?param=%7B%22user_name%22:%22"+ username+"%22,%22password%22:%22" + password + "%22%7D";
		get = new HttpGet(loginURL);
		HttpClient httpClient = HttpClientBuilder.create().build();		
		Gson gson = new Gson();
		PersonalDto per = null;
		
		get.setHeader("Content-type", "application/json");
		HttpResponse response = httpClient.execute(get);
		String json = EntityUtils.toString(response.getEntity(), "UTF-8");		
		StaffioLoginResultDto loginResult =  gson.fromJson(json, StaffioLoginResultDto.class);
		if(!loginResult.isComplete()) {
			per = new PersonalDto();
			per.setErrorMsg("Username/Password Incorrect");
			return false;
		}
		return true;
	}

	
	private PersonalDto getPersonal(PersonalDto personal) throws Exception {		
		
		
//		String url = "http://45.116.216.131:8080/Staffio_API/api/GetPersonalByEmpCode?EmpCode=Test001";		
		String url = "http://45.116.216.131:8080/Staffio_API/api/GetPersonalByEmpCode?EmpCode=" + personal.getUsername();
		HttpGet get = null;		

		HttpClient httpClient = HttpClientBuilder.create().build();		
		Gson gson = new Gson();
		PersonalDto per = null;
		get = new HttpGet(url);
		get.setHeader("Content-type", "application/json");
		HttpResponse response = httpClient.execute(get);
		response = httpClient.execute(get);
		String json = EntityUtils.toString(response.getEntity(), "UTF-8");
		StaffioPersonalDto result =  gson.fromJson(json, StaffioPersonalDto.class);		
		if(DataUtils.isBlankValue(result)) {
			per = new PersonalDto();
			per.setErrorMsg("Username/Password Incorrect");
			return per;
		}
		per = StaffioPersonalToPersonal.transform(result);

		TitleDto title = CacheUtil.getTitleByCode(per.getTitleNameCode());
		per.setTitleNameEN(title.getTitleEN());
		per.setTitleNameTH(title.getTitleTH());
		per.setDepDto(CacheUtil.getDepartmentByCode(per.getUnitCode()));
		return per;		
	}
		
}
