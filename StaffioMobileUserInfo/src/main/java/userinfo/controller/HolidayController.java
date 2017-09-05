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

import userinfo.dto.HolidayDto;
import userinfo.service.HolidayService;

@RestController
public class HolidayController {
	
//	@Autowired
//	private HolidayService holidayService;
	
	@ResponseBody
	@RequestMapping(value="/getHoliday", method=RequestMethod.POST)
	public List<HolidayDto> getHoliday(@RequestHeader HttpHeaders header, @RequestBody HolidayDto dto){
		//return holidayService.getHolidayAll();
		return null;
	}
}
