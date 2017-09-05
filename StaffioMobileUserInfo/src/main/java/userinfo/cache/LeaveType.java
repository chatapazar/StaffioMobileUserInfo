package userinfo.cache;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.cache.annotation.Cacheable;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import userinfo.dto.LeaveTypeDto;
import userinfo.restclient.dto.StaffioLeaveTypeDto;
import userinfo.transform.StaffioLeaveTypeToLeaveTypeDto;
import userinfo.utils.DataUtils;


public class LeaveType {
	private static List<LeaveTypeDto> leaveTypes;
    
    static{
    	leaveTypes = getLeaveTypeDtoAll();
    }   
	
	private static List<LeaveTypeDto> getLeaveTypeDtoAll() {
		String postUrl = "http://45.116.216.131:8080/Staffio_API/api/ListAllLeaveType";
		Gson gson = new Gson();
		HttpClient httpClient = HttpClientBuilder.create().build();
		HttpGet get = new HttpGet(postUrl);
		get.setHeader("Content-type", "application/json");
		try {
			HttpResponse response = httpClient.execute(get);
			String json = EntityUtils.toString(response.getEntity(), "UTF-8");	
			List<StaffioLeaveTypeDto> result =  gson.fromJson(json,  new TypeToken<List<StaffioLeaveTypeDto>>() {}.getType());
			return StaffioLeaveTypeToLeaveTypeDto.transform(result);
		}catch(Exception e) {
			e.printStackTrace();
		}		
		return null;
	}
	
	@Cacheable(value="leaveType")
	public List<LeaveTypeDto> getLeaveTypeDtoByCode(String leaveTypeCode) {
		if(leaveTypes.isEmpty())
			leaveTypes = getLeaveTypeDtoAll();
		if(DataUtils.isBlankValue(leaveTypeCode)) {
			return leaveTypes;
		}
		for(LeaveTypeDto leave : leaveTypes) {
			if(leave.getLeaveTypeCode().equals(leaveTypeCode)) {
				List<LeaveTypeDto> list = new ArrayList<LeaveTypeDto>();
				list.add(leave);
				return list;
			}
		}
		return null;
	}

}
