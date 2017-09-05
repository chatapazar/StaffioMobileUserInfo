package userinfo.service;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import userinfo.utils.HeaderRequestInterceptor;

@Service
public class NotificationService {

	private static final String FIREBASE_SERVER_KEY = "AAAAAQMYDGk:APA91bFgNTHindHQtG2sMmnntDqa1RmmqngBcx1B9DTvS6v2PzhsBljbYR2wnKwV_XFCaZYp67McFmA-AjNkfK9ORP4wsGgaShkJTeafR6lwTYa45n25UGVhWSRsO9OodZgmi6ax4Xb1";
	private static final String FIREBASE_API_URL = "https://fcm.googleapis.com/fcm/send";
	
	@Async
	public CompletableFuture<String> send(HttpEntity<String> entity) {

		RestTemplate restTemplate = new RestTemplate();

		/**S
		https://fcm.googleapis.com/fcm/send
		Content-Type:application/json
		Authorization:key=FIREBASE_SERVER_KEY*/

		ArrayList<ClientHttpRequestInterceptor> interceptors = new ArrayList<>();
		interceptors.add(new HeaderRequestInterceptor("Authorization", "key=" + FIREBASE_SERVER_KEY));
		interceptors.add(new HeaderRequestInterceptor("Content-Type", "application/json"));
		restTemplate.setInterceptors(interceptors);

		String firebaseResponse = restTemplate.postForObject(FIREBASE_API_URL, entity, String.class);

		return CompletableFuture.completedFuture(firebaseResponse);
	}
	
	public ResponseEntity<String> pushNoti() throws JSONException {
		JSONObject body = new JSONObject();
		body.put("to", "/topic/" + "mobileStaffio");
		body.put("priority", "high");

		JSONObject notification = new JSONObject();
		notification.put("title", "Staffio Notification");
		notification.put("body", "You have a new task to approve!");
		
		JSONObject data = new JSONObject();
		data.put("Key-1", "JSA Data 1");
		data.put("Key-2", "JSA Data 2");

		body.put("notification", notification);
		body.put("data", data);

/**
		{
		   "notification": {
		      "title": "JSA Notification",
		      "body": "Happy Message!"
		   },
		   "data": {
		      "Key-1": "JSA Data 1",
		      "Key-2": "JSA Data 2"
		   },
		   "to": "/topics/JavaSampleApproach",
		   "priority": "high"
		}
*/

		HttpEntity<String> request = new HttpEntity<>(body.toString());

		CompletableFuture<String> pushNotification = send(request);
		CompletableFuture.allOf(pushNotification).join();

		try {
			String firebaseResponse = pushNotification.get();
			System.out.println(firebaseResponse);
			return new ResponseEntity<>(firebaseResponse, HttpStatus.OK);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

		return new ResponseEntity<>("Push Notification ERROR!", HttpStatus.BAD_REQUEST);
	}
}