package userinfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import userinfo.dao.TbPersonalDAO;
import userinfo.dto.PersonalDto;

@Service
public class PersonalService {

	@Autowired
	TbPersonalDAO personalDao;
	
	public PersonalDto updatePersonal(PersonalDto dto) {
		
		return null;
	}
	
	public List<PersonalDto> getAllPersonal(){
		return personalDao.getAllPersonal();
	}
}
