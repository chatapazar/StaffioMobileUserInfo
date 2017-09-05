package userinfo.utils;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;

import java.lang.reflect.ParameterizedType;

public class HttpURLConnectionUtil<T> {
//	private final String USER_AGENT = "Mozilla/5.0";
//	
//	private Class<T> reqType;
//	
//	public HttpURLConnectionUtil() {
//		this.reqType  = (Class<T>) ((ParameterizedType) getClass()
//				.getGenericSuperclass()).getActualTypeArguments()[0];;
//		
//	}
//
//	public static void main(String[] args) throws Exception {
//
//		HttpURLConnectionUtil http = new HttpURLConnectionUtil();
//
//		System.out.println("Testing 1 - Send Http GET request");
//		
//
//		System.out.println("\nTesting 2 - Send Http POST request");
////		http.sendPost();
////		Greeting greeting = new Greeting();
//		greeting.setContent("abcd");
//		greeting.setId(1);
////		greeting = (Greeting) sentPost("http://localhost:8080/greeting", greeting);
//		System.out.println(greeting.getId());
//        System.out.println(greeting.getContent());
//
//	}
//	
//
//	// HTTP POST request
//	private void sendPost() throws Exception {
//		String postUrl = "http://localhost:8080/greeting";// put in your url
////		Greeting greeting = new Greeting();
//		greeting.setContent("abcd");
//		greeting.setId(1);
//		Gson gson = new Gson();
//		HttpClient httpClient = HttpClientBuilder.create().build();
//		HttpPost post = new HttpPost(postUrl);
//		StringEntity postingString = new StringEntity(gson.toJson(greeting));// gson.tojson() converts your pojo to json
//		post.setEntity(postingString);
//		post.setHeader("Content-type", "application/json");
//		HttpResponse response = httpClient.execute(post);
//		String json = EntityUtils.toString(response.getEntity(), "UTF-8");
////		Greeting result =  gson.fromJson(json, Greeting.class);
//
//        System.out.println(result.getId());
//        System.out.println(result.getContent());
//	}
//	
//	public T sentPost(String url, Object request)throws Exception {
//		
//		Gson gson = new Gson();
//		HttpClient httpClient = HttpClientBuilder.create().build();
//		HttpPost post = new HttpPost(url);
//		StringEntity postingString = new StringEntity(gson.toJson(url));// gson.tojson() converts your pojo to json
//		post.setEntity(postingString);
//		post.setHeader("Content-type", "application/json");
//		HttpResponse response = httpClient.execute(post);
//		String json = EntityUtils.toString(response.getEntity(), "UTF-8");
//		T result =  (T) gson.fromJson(json, reqType);
//		return result;
//	}
}
