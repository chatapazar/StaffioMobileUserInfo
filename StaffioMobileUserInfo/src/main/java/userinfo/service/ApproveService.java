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
import com.google.gson.reflect.TypeToken;

import userinfo.dto.ApproveDto;
import userinfo.dto.LeaveReqDto;
import userinfo.dto.LeaveTranDto;
import userinfo.restclient.dto.LeaveReq;
import userinfo.restclient.dto.StaffioLeaveCalendarDto;
import userinfo.restclient.dto.StaffioLeaveDto;
import userinfo.transform.StaffioLeaveCalenderToLeaveCalendar;
import userinfo.transform.StaffioLeaveReqToLeaveReq;
import userinfo.utils.DataUtils;

@Service
public class ApproveService {
	
	public List<LeaveReqDto> getLeaveReqByApprover(ApproveDto dto){
		List<LeaveReqDto> list = new ArrayList<LeaveReqDto>();
		
		String approveBy = "";
		String empcode = "";
		String leaveTypeCode = "";
		
		if(DataUtils.isBlankValue(dto.getApproveBy()) || DataUtils.isBlankValue(dto.getLeaveType())){
			return null;
		}
		
		approveBy = dto.getApproveBy();		
		leaveTypeCode = dto.getLeaveType();
		
		if(DataUtils.isBlankValue(dto.getEmpCode())){
			empcode = dto.getEmpCode();
		}
		String url = "http://45.116.216.131:8080/Staffio_API/api/GetListApproveLeaveByApprover?ApproveBy="+ approveBy +"&EmpCode=" + empcode+ "&LeaveTypeCode=" + leaveTypeCode;
		Gson gson = new Gson();
		HttpClient httpClient = HttpClientBuilder.create().build();
		HttpGet get = new HttpGet(url);
		get.setHeader("Content-type", "application/json");
		try {
			HttpResponse response = httpClient.execute(get);
			String json = EntityUtils.toString(response.getEntity(), "UTF-8");
			TaskList result =  gson.fromJson(json, TaskList.class);
			
			return StaffioLeaveReqToLeaveReq.transformListLeaveReq(result.LeaveReq);
		}catch(Exception e) {
			e.printStackTrace();
		}		
		return list;
		
	}

}

class TaskList {
	List<LeaveReq> LeaveReq;
	
}
