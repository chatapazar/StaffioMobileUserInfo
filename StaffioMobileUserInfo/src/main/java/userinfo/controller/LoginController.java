package userinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import userinfo.dao.TbPersonalDAO;
import userinfo.dto.PersonalDto;
import userinfo.service.LoginService;

@RestController
public class LoginController {
	
	//@Autowired
	//LoginService loginService;
	

	
	@ResponseBody
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public PersonalDto login(@RequestHeader HttpHeaders hearder, @RequestBody PersonalDto userDto) {
		//return loginService.login(userDto);
		return null;
	}

}
