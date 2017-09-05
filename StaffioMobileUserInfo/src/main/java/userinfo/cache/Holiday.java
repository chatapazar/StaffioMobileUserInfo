package userinfo.cache;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;

import userinfo.dto.HolidayDto;
import userinfo.service.HolidayService;

public class Holiday {
	private static List<HolidayDto> holidays;
	
	@Autowired
	HolidayService holidayService;
	
	
	
	static {
		holidays = initHoliday();
	}
	
	private static List<HolidayDto> initHoliday(){
		return null;// holidayService.getHolidayAll();
	}
	
	@Cacheable(value="holiday")
	public List<HolidayDto> getHoliday(){
		return holidayService.getHolidayAll();
	}
	
}
