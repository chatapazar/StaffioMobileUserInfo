package userinfo.cache;

import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import userinfo.dto.TitleDto;
import userinfo.restclient.dto.StaffioTitleDto;
import userinfo.transform.StaffioTitleToTitle;

@Component
public class Title {	
	
	private static List<TitleDto> titles;
    
    static{
    	titles = getTitleDtoAll();
    }   
	
	private static List<TitleDto> getTitleDtoAll() {
//		String postUrl = "http://45.116.216.131:8080/Staffio_API/api/GetTitleName";
//		Gson gson = new Gson();
//		HttpClient httpClient = HttpClientBuilder.create().build();
//		HttpGet get = new HttpGet(postUrl);
//		get.setHeader("Content-type", "application/json");
//		try {
//			HttpResponse response = httpClient.execute(get);
//			String json = EntityUtils.toString(response.getEntity(), "UTF-8");
//			List<StaffioTitleDto> result =  gson.fromJson(json,  new TypeToken<List<StaffioTitleDto>>() {}.getType());
//			 return StaffioTitleToTitle.transform(result);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}		
		return null;
	}
	
	@Cacheable(value="titles")
	public TitleDto getTitleByCode(String titleCode) {
//		if(titles.isEmpty())
//			titles = getTitleDtoAll();
//		for(TitleDto title : titles) {
//			if(title.getTitleNo().equals(titleCode)) {
//				return title;
//			}
//		}
		return null;
	}
}
