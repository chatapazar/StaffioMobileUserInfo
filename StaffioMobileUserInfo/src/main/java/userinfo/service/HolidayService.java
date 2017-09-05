package userinfo.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import userinfo.dto.HolidayDto;
import userinfo.restclient.dto.StaffioHolidayDto;

@Service
public class HolidayService {
	public List<HolidayDto> getHolidayAll() {
		String url = "http://45.116.216.131:8080/Staffio_API/api/ListHoliday?code=00428&year=2017";
		// String url = "http://45.116.216.131:8080/Staffio_API/api/ListHoliday?code=" +
		// dto.getOrgCode() + "&year="+ dto.getYear();
		Gson gson = new Gson();
		HttpClient httpClient = HttpClientBuilder.create().build();
		HttpGet get = new HttpGet(url);
		get.setHeader("Content-type", "application/json");
		try {
			HttpResponse response = httpClient.execute(get);
			String json = EntityUtils.toString(response.getEntity(), "UTF-8");
			Temp result = gson.fromJson(json, Temp.class);
			return transform(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<HolidayDto> transform(Temp tmp) {
		List<HolidayDto> list= new ArrayList<HolidayDto>();
		Data[] data= tmp.getData();
		for(Data staffio : data) {
			HolidayDto dto = new HolidayDto();
			dto.setHolidayID(staffio.getHOLIDAY_ID());
			dto.setOrgCode(staffio.getORG_CODE());
			dto.setYear(staffio.getYEAR());
			dto.setHolidayDate(staffio.getStrHOLIDAYDATE());
			dto.setHolidayNameEN(staffio.getHOLIDAY_NAME_EN());
			dto.setHolidayNameTH(staffio.getHOLIDAY_NAME_TH());
			list.add(dto);
		}
		return list;		
	}

}

class Temp {
	private Data[] data;

	public Data[] getData() {
		return data;
	}

	public void setData(Data[] data) {
		this.data = data;
	}
}

class Data extends StaffioHolidayDto{
	
}