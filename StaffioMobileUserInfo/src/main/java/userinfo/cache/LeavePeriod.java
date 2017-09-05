package userinfo.cache;

import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.cache.annotation.Cacheable;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import userinfo.dto.LeavePeriodDto;
import userinfo.restclient.dto.StaffioLeavePeriodDto;
import userinfo.transform.StaffioLeavePeriodToLeavePeriod;

public class LeavePeriod {
	private static List<LeavePeriodDto> leavePeriods;
	
	static {
		leavePeriods = getAllLeavePeriod();
	}
	
	private static List<LeavePeriodDto> getAllLeavePeriod(){
		String postUrl = "http://45.116.216.131:8080/Staffio_API/api/GetDDLCategoryByCode?Code=LEAVE_ACTION&orderFieldName=CATEGORY_CODE&sortBy=ASC";
		Gson gson = new Gson();
		HttpClient httpClient = HttpClientBuilder.create().build();
		HttpGet get = new HttpGet(postUrl);
		get.setHeader("Content-type", "application/json");
		try {
			HttpResponse response = httpClient.execute(get);
			String json = EntityUtils.toString(response.getEntity(), "UTF-8");	
			List<StaffioLeavePeriodDto> result =  gson.fromJson(json,  new TypeToken<List<StaffioLeavePeriodDto>>() {}.getType());
			return StaffioLeavePeriodToLeavePeriod.transform(result);
		}catch(Exception e) {
			e.printStackTrace();
		}		
		return null;
	}
	
	@Cacheable(value="leavePeriod")
	public List<LeavePeriodDto> getLeavePeriod(){
		if (leavePeriods.isEmpty())
			leavePeriods = getAllLeavePeriod();
		return leavePeriods;
	}
	
	
}
