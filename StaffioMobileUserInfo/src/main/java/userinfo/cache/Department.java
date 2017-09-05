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

import userinfo.dto.DepartmentDto;
import userinfo.restclient.dto.StaffioDepartmentDto;
import userinfo.transform.StaffioDepartmentToDepartment;

public class Department {
	private static List<DepartmentDto> departments;
    
    static{
    	departments = getDepartmentDtoAll();
    }   
	
	private static List<DepartmentDto> getDepartmentDtoAll() {
		String url = "http://45.116.216.131:8080/Staffio_API/api/GetDDLDepartmentbyCompanyList";		
		Gson gson = new Gson();
		HttpClient httpClient = HttpClientBuilder.create().build();
		HttpGet get = new HttpGet(url);
		get.setHeader("Content-type", "application/json");
		try {
			HttpResponse response = httpClient.execute(get);
			String json = EntityUtils.toString(response.getEntity(), "UTF-8");
			List<StaffioDepartmentDto> result =  gson.fromJson(json,  new TypeToken<List<StaffioDepartmentDto>>() {}.getType());
			return StaffioDepartmentToDepartment.transform(result);
		}catch(Exception e) {
			e.printStackTrace();
		}		
		return null;
	}
	
	@Cacheable(value="department")
	public DepartmentDto getDepartmentByCode(String unitcode) {
		if(departments.isEmpty())
			departments = getDepartmentDtoAll();
		for(DepartmentDto dept : departments) {
			if(dept.getUnitCode().equals(unitcode)) {
				return dept;
			}
		}
		return null;
	}
}
