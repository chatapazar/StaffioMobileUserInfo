package userinfo.utils;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import userinfo.cache.Department;
import userinfo.cache.Holiday;
import userinfo.cache.LeavePeriod;
import userinfo.cache.LeaveType;
import userinfo.cache.Title;
import userinfo.config.AppConfig;
import userinfo.dto.DepartmentDto;
import userinfo.dto.LeavePeriodDto;
import userinfo.dto.LeaveTypeDto;
import userinfo.dto.TitleDto;

public class CacheUtil {
	
	public static TitleDto getTitleByCode(String titleCode) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);		 
        Title title = (Title) context.getBean("title");
        return title.getTitleByCode(titleCode);
	}
	
	public static DepartmentDto getDepartmentByCode(String unitCode) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);		 
		Department dept = (Department) context.getBean("department");
        return dept.getDepartmentByCode(unitCode);
	}
	
	public static List<LeaveTypeDto> getLeaveTypeInfoByCode(String leaveTypeCode) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);		 
		LeaveType leaveType = (LeaveType) context.getBean("leaveType");
        return leaveType.getLeaveTypeDtoByCode(leaveTypeCode);
	}
	
	public static List<LeavePeriodDto> getLeavePeriod() {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);		 
		LeavePeriod leavePeriod = (LeavePeriod) context.getBean("leavePeriod");
        return leavePeriod.getLeavePeriod();
	}
	
	public static List<LeavePeriodDto> getHoliday() {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);		 
		Holiday leavePeriod = (Holiday) context.getBean("leavePeriod");
        return null;//leavePeriod.getLeavePeriod();
	}
	
}
