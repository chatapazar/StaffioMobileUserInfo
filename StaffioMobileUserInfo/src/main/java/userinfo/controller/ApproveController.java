package userinfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import userinfo.dto.ApproveDto;
import userinfo.dto.LeaveReqDto;
import userinfo.dto.LeaveTranDto;
import userinfo.service.ApproveService;

@RestController
public class ApproveController {

	
//	@Autowired
//	private ApproveService approveService;
	
	@ResponseBody
	@RequestMapping(value="/getLeaveByApproveID", method=RequestMethod.POST)	
	public List<LeaveReqDto> getLeaveByApproveID(@RequestHeader HttpHeaders header,@RequestBody ApproveDto dto) {
		//return approveService.getLeaveReqByApprover(dto);
		return null;
	}
}
