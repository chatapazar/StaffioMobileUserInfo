package userinfo.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.SerializationUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import userinfo.dto.LeaveAmountDto;
import userinfo.dto.LeaveCalendarDto;
import userinfo.dto.LeaveReqDto;
import userinfo.dto.LeaveTranDto;
import userinfo.dto.LeaveTransactionDetailDto;
import userinfo.dto.PersonalDto;
import userinfo.restclient.dto.StaffioLeaveTransactionDetail;
import userinfo.restclient.dto.StaffioLeaveCalendarDto;
import userinfo.restclient.dto.StaffioLeaveDto;
import userinfo.restclient.dto.LeaveReq;
import userinfo.restclient.dto.LeaveTran;
import userinfo.transform.StaffioLeaveAmountToLeaveDto;
import userinfo.transform.StaffioLeaveCalenderToLeaveCalendar;
import userinfo.transform.StaffioLeaveReqToLeaveReq;
import userinfo.utils.DataUtils;
import userinfo.utils.DateUtil;

@Service
public class LeaveService {
	public List<LeaveAmountDto> getLeaveAmount(PersonalDto personal){
		return callGetPersonal(personal);
	}	
	
	private List<LeaveAmountDto> callGetPersonal(PersonalDto personal) {
		String empCode = "";
		if(DataUtils.isNotBlankValue(personal.getEmployeeCode())) {
			empCode = personal.getEmployeeCode();
		}
		String url = "http://45.116.216.131:8080/Staffio_API/api/EmpInfoGetLeaveTypeAmountByEmpCode?ApproveBy=&EmpCode=" + empCode + "&sYearMonth=";
		Gson gson = new Gson();
		HttpClient httpClient = HttpClientBuilder.create().build();
		HttpGet get = new HttpGet(url);
		get.setHeader("Content-type", "application/json");
		try {
			HttpResponse response = httpClient.execute(get);
			String json = EntityUtils.toString(response.getEntity(), "UTF-8");
			List<StaffioLeaveDto> result =  gson.fromJson(json,  new TypeToken<List<StaffioLeaveDto>>() {}.getType());
			 return StaffioLeaveAmountToLeaveDto.transform(result);
		}catch(Exception e) {
			e.printStackTrace();
		}		
		return null;	
	}
	
	public String createLeaveReq(LeaveReqDto req) {
		Gson g = new Gson();

		
		List<LeaveTransactionDetailDto> transactions = req.getLeavetransaction();
		if(transactions.size()>1) {
			transactions = genleaveTrans(transactions);
		}
		RequestLeave reqLeave = new RequestLeave();
		reqLeave.LeaveReq = StaffioLeaveReqToLeaveReq.transform(req);
		reqLeave.LeaveTran = StaffioLeaveReqToLeaveReq.transform(req.getLeaveTranDto());
		reqLeave.ListLeaveRequestDetail = StaffioLeaveReqToLeaveReq.transfrom(transactions);
		reqLeave.ListLeaveTransactionDetail =(StaffioLeaveReqToLeaveReq.transfrom(transactions));
		String url = "http://45.116.216.131:8080/Staffio_API/api/CreateESSLeaveRequest";
		String jsonString = g.toJson(reqLeave);
		System.out.println("json here >>>> " + jsonString);
		Gson gson = new Gson();
		HttpClient httpClient = HttpClientBuilder.create().build();
		HttpPost post = new HttpPost(url);	
		
		try {
			post.setHeader("Content-type", "application/json");
			StringEntity postingString = new StringEntity(gson.toJson(reqLeave));
			post.setEntity(postingString);
			HttpResponse response = httpClient.execute(post);
			String json = EntityUtils.toString(response.getEntity(), "UTF-8");
			System.out.println("Result >>> " + json);
			return json;
//			List<StaffioLeaveDto> result =  gson.fromJson(json,  new TypeToken<List<StaffioLeaveDto>>() {}.getType());
		
		}catch(Exception e) {
			e.printStackTrace();
		}		
		return "";
	}
	private List<LeaveTransactionDetailDto> genleaveTrans(List<LeaveTransactionDetailDto> transactions) {
		List<LeaveTransactionDetailDto> result = new ArrayList<LeaveTransactionDetailDto>();
		LeaveTransactionDetailDto firstTran = transactions.get(0);
		LeaveTransactionDetailDto lastTran = transactions.get(1);
		Date startDate = null;
		Date endDate = null;
		try {
			startDate = DateUtil.convertStringToDateByFormat(firstTran.getStartDate(),"MM/dd/yyyy");
			endDate = DateUtil.convertStringToDateByFormat(lastTran.getStartDate(),"MM/dd/yyyy");
			int amount = (int)DateUtil.diffDayCalculate(startDate, endDate);
			result.add(firstTran);
			startDate = getNextWorkDay(startDate);
			while(startDate.before(endDate)){
				LeaveTransactionDetailDto tran = SerializationUtils.clone(firstTran);
				tran.setStartDate(DateUtil.toStringEngDateBySimpleFormat(startDate,"MM/dd/yyyy"));
				tran.setEffectiveDate(DateUtil.toStringEngDateBySimpleFormat(startDate,"MM/dd/yyyy"));
				tran.setEndDate(DateUtil.toStringEngDateBySimpleFormat(startDate,"MM/dd/yyyy"));
				tran.setLeavePeriod("FULLDAY");
				result.add(tran);
				startDate = getNextWorkDay(startDate);	
			}			
			result.add(lastTran);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	private static Date getNextWorkDay(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		if (dayOfWeek == Calendar.FRIDAY) {
			c.add(Calendar.DATE, 3);
		} else if (dayOfWeek == Calendar.SATURDAY) {
			c.add(Calendar.DATE, 2);
		} else {
			c.add(Calendar.DATE, 1);
		}
		return c.getTime();
	}
	
	public List<LeaveCalendarDto> getLeaveCalendar(PersonalDto dto) {
		String empCode="";
		if(DataUtils.isBlankValue(dto.getEmployeeCode())){
			return null;
		}
		empCode = dto.getEmployeeCode();
		String url = "http://45.116.216.131:8080/Staffio_API/api/GetListLeaveCalendarbyEmpCode?EMP_CODE="+ empCode;
		Gson gson = new Gson();
		HttpClient httpClient = HttpClientBuilder.create().build();
		HttpGet get = new HttpGet(url);
		get.setHeader("Content-type", "application/json");
		try {
			HttpResponse response = httpClient.execute(get);
			String json = EntityUtils.toString(response.getEntity(), "UTF-8");
			List<StaffioLeaveCalendarDto> result =  gson.fromJson(json,  new TypeToken<List<StaffioLeaveCalendarDto>>() {}.getType());
			return StaffioLeaveCalenderToLeaveCalendar.transform(result);
		}catch(Exception e) {
			e.printStackTrace();
		}		
		return null;	
	}
	
	public LeaveTranDto getLeaveReqInfo(LeaveTranDto dto) {
		LeaveTran result = null;
		
		if(DataUtils.isBlankValue(dto.getRequestLeaveNo())) {
			return null;
		}
		
		String url = "http://45.116.216.131:8080/Staffio_API/api/GetESSLeaveRequest?REQUEST_LEAVE_NO="+ dto.getRequestLeaveNo();
		Gson gson = new Gson();
		HttpClient httpClient = HttpClientBuilder.create().build();
		HttpGet get = new HttpGet(url);
		get.setHeader("Content-type", "application/json");
		try {
			HttpResponse response = httpClient.execute(get);
			String json = EntityUtils.toString(response.getEntity(), "UTF-8");
			result =  gson.fromJson(json, LeaveTran.class);
			LeaveTranDto trandto =  StaffioLeaveReqToLeaveReq.transform(result);
			List<LeaveTransactionDetailDto> tranDetails = null;//StaffioLeaveReqToLeaveReq.transform(result.getList().getListTran());
			trandto.setTranDetail(tranDetails);
			return trandto;
		}catch(Exception e) {
			e.printStackTrace();
		}	
		
		return null;
				
				
	}
	
	private LeaveReqDto createReq(LeaveReqDto dto) {
		LeaveReqDto req = new LeaveReqDto();
		dto.setCreateBy(dto.getEmpCode());
		dto.setUpdateBy(dto.getEmpCode());
//		dto.setOrgCode(dto.getOrgCode());
//		req.setUnitCode(dto.getUnitCode());
//		req.setLeaveTypeCode(dto.getLeaveTypeCode());
//		req.setPerioadYear(dto.getPerioadYear());
//		req.setRemark(dto.getRemark());
		
		LeaveTranDto tranDto = new LeaveTranDto();
		tranDto.setEmpCode(dto.getEmpCode());
		tranDto.setOrgCode(dto.getOrgCode());
		tranDto.setUnitCode(dto.getUnitCode());
		tranDto.setLeaveTypeCode(dto.getLeaveTypeCode());
		tranDto.setPerioadYear(dto.getPerioadYear());
		tranDto.setCreateBy(dto.getEmpCode());
		tranDto.setUpdateBy(dto.getEmpCode());
		dto.setLeaveTranDto(tranDto);
		
		
		
		return dto;		
	}
			

}

class RequestLeave{
	LeaveReq LeaveReq;
	LeaveTran LeaveTran;
	List<StaffioLeaveTransactionDetail> ListLeaveRequestDetail;
	List<StaffioLeaveTransactionDetail> ListLeaveTransactionDetail;
	public RequestLeave() {
		LeaveReq = new LeaveReq();
		LeaveTran = new LeaveTran();
//		ListLeaveRequestDetail = new ListLeaveRequestDetail();
//		ListLeaveTransactionDetail = new ListLeaveTransactionDetail();
	}
}







