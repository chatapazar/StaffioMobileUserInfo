package userinfo.controller;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import userinfo.dto.LeaveAmountDto;
import userinfo.dto.LeaveCalendarDto;
import userinfo.dto.LeavePeriodDto;
import userinfo.dto.LeaveReqDto;
import userinfo.dto.LeaveTranDto;
import userinfo.dto.LeaveTypeDto;
import userinfo.dto.PersonalDto;
import userinfo.service.LeaveService;
import userinfo.service.NotificationService;
import userinfo.utils.CacheUtil;

@RestController
public class LeaveController {
	
//	@Autowired
//	LeaveService leaveService;
	
//	@Autowired
//	NotificationService notiService;
	
	@ResponseBody
	@RequestMapping(value="/getLeaveAmount", method=RequestMethod.POST)	
	public List<LeaveAmountDto> getleaveAmount(@RequestHeader HttpHeaders hearder, @RequestBody PersonalDto personal) {
		//return leaveService.getLeaveAmount(personal);
		return null;
	}
		
	@ResponseBody
	@RequestMapping(value="/getLeaveType", method=RequestMethod.POST)	
	public List<LeaveTypeDto> getleaveInfo(@RequestHeader HttpHeaders hearder, @RequestBody LeaveTypeDto dto) {
        //return CacheUtil.getLeaveTypeInfoByCode(dto.getLeaveTypeCode());
        return null;
	}
	
	@ResponseBody
	@RequestMapping(value="/getLeavePeriod", method=RequestMethod.POST)	
	public List<LeavePeriodDto> getleavePeriod(@RequestHeader HttpHeaders hearder) {
        //return CacheUtil.getLeavePeriod();		
		return null;
	}
	
	@ResponseBody
	@RequestMapping(value="/createLeaveReq", method=RequestMethod.POST)	
	public LeaveReqDto createLeaveReq(@RequestHeader HttpHeaders hearder,@RequestBody LeaveReqDto dto) {
//		String result = leaveService.createLeaveReq(dto);
//		LeaveReqDto res = new LeaveReqDto();
//		if(result.contains("true")) {			
//			res.setSuccessMsg("Success");
//			try {
//				notiService.pushNoti();
//			} catch (JSONException e) {
//				e.printStackTrace();
//			}
//			return res;
//		}else {
//			res.setErrorMsg("Cann't Create Leave Request");
//		}
		return null;		
	}
	
	@ResponseBody
	@RequestMapping(value="/getLeaveCalendar", method=RequestMethod.POST)	
	public List<LeaveCalendarDto> getLeaveCarlendar(@RequestHeader HttpHeaders hearder, @RequestBody PersonalDto dto) {
		//return leaveService.getLeaveCalendar(dto);	
		return null;
	}
	
	@ResponseBody
	@RequestMapping(value="/pushNoti", method=RequestMethod.POST)	
	public LeaveReqDto pushNoti(@RequestHeader HttpHeaders hearder) {
//			LeaveReqDto res = new LeaveReqDto();
//			res.setSuccessMsg("Success");
//			try {
//				notiService.pushNoti();
//				res.setSuccessMsg("Push complete");
//			} catch (JSONException e) {
//				res.setErrorMsg("Push fail");
//				e.printStackTrace();
//			}
		return null;
		//return res;		
	}
		
	@ResponseBody
	@RequestMapping(value="/getLeaveReqInfo", method=RequestMethod.POST)	
	public LeaveTranDto getLeaveReqInfo(@RequestHeader HttpHeaders hearder,@RequestBody LeaveTranDto dto) {
//		return leaveService.getLeaveReqInfo(dto);	
		return null;
	}
        
}
