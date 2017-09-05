package userinfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import userinfo.dto.PersonalDto;
import userinfo.service.PersonalService;

@RestController
public class PersonalDataController {

	@Autowired
	PersonalService personalService;
	
	@ResponseBody
	@RequestMapping(value="/getListEmployee", method=RequestMethod.POST)
	public List<PersonalDto> getListEmployee(){
		
		
		return null;
	}
	
	@ResponseBody
	@RequestMapping(value="/getAllEmployee", method=RequestMethod.GET)
	public List<PersonalDto> getAllEmployee(){
		return personalService.getAllPersonal();
	}
	
	@ResponseBody
	@RequestMapping(value="/", method=RequestMethod.POST)
	public PersonalDto updateProfile(PersonalDto personal){	
		
		return null;
	}
}
