package userinfo.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.client.RestTemplate;

import userinfo.cache.Department;
import userinfo.cache.LeavePeriod;
import userinfo.cache.LeaveType;
import userinfo.cache.Title;
import userinfo.dao.TbPersonalDAO;

@Configuration
public class AppConfig {	
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
		
//	@Bean
//	public Title title() {
//	    return new Title();
//	}
//	
//	@Bean
//	public Department department() {
//	    return new Department();
//	}
//	
//	@Bean
//	public LeaveType leaveType() {
//		return new LeaveType();
//	}
//	
//	@Bean
//	public LeavePeriod leavePeriod() {
//		return new LeavePeriod();
//	}

}
