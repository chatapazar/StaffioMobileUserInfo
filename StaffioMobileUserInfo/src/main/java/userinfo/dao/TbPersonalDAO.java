package userinfo.dao;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import userinfo.dto.PersonalDto;
import userinfo.utils.DataUtils;

@Repository
public class TbPersonalDAO extends JdbcDaoSupport {
	
	@Autowired 
    DataSource dataSource;	
	
	@PostConstruct
	private void initailize() {
		setDataSource(dataSource);
	}
	
	public List<PersonalDto> getListPersonal(PersonalDto dto) {
		boolean criteria = false;
		PersonalDto result = null;
		StringBuffer sql = new StringBuffer();
		List<PersonalDto> list = null;

		try {
			if (dto != null) {				
				sql.append("select p.*,t.*,dep.* from tb_personal per ");
				sql.append("left join tb_m_title ti ");
				sql.append("on per.title_name_code = ti.title_no");
				sql.append("left join tb_m_department dep ");
				sql.append("on per.unit_code = dep.unitcode");
				sql.append("where ");
				if (DataUtils.isNotBlankValue(dto.getUserID())){
					if (DataUtils.isNotBlankValue(dto.getPin())){
						sql.append(" user_id = '" + dto.getUserID() + "'" );
						sql.append(" and pin = '" + dto.getPin() + "'" );
						criteria = true;
					} else if (DataUtils.isNotBlankValue(dto.getTouchID())){
						sql.append(" user_id = '" + dto.getUserID() + "'" );
						sql.append(" and pin = '" + dto.getTouchID() + "'" );
						criteria = true;
					}
				}else if (DataUtils.isNotBlankValue(dto.getUsername())
						&& DataUtils.isNotBlankValue(dto.getPassword())
						&& DataUtils.isNotBlankValue(dto.getUnitCode())){
					sql.append(" username = '" + dto.getUsername() + "'" );
					sql.append(" and user_password = '" + dto.getPassword() + "'" );
					sql.append(" and unit_code = '" + dto.getUnitCode() + "'" );
					criteria = true;
				}			
				if(criteria) {					
					List<Map<String, Object>> rows = null; //jdbcTemplate.queryForList(sql.toString());
					result = new PersonalDto();
					
					if(!rows.isEmpty()) {
					 list = new ArrayList<PersonalDto>();
						for(Map row : rows) {
							result.setUserID((BigDecimal)row.get("user_id"));
							result.setPersonalID((String)row.get("personal_id"));
							result.setEmployeeCode((String)row.get("employee_code"));
							result.setTitleNameCode((String)row.get("title_name_code"));
							result.setTitleNameTH((String)row.get("title_th"));
							result.setTitleNameEN((String)row.get("title_en"));
							result.setFullNameTH((String)row.get("full_name_th"));
							result.setFullNameEN((String)row.get("full_name_en"));
							result.setOrgCode((String)row.get("org_code"));
							result.setUnitCode((String)row.get("unit_code"));
							result.setPositionName((String)row.get("position_name"));
							result.setUsername((String)row.get("username"));
							result.setPassword((String)row.get("user_password"));
							result.setPin((String)row.get("pin"));
							result.setTouchID((String)row.get("touch_id"));
							result.setDeviceID((String)row.get("device_code"));
							result.setLeaderCode((String)row.get("leader_code"));
							list.add(result);
						}

					}
				}				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}		
		return list;
	}
	
	public List<PersonalDto> getAllPersonal() {
		PersonalDto result = null;
		StringBuffer sql = new StringBuffer();
		List<PersonalDto> list = null;

		try {
				sql.append("select * from tb_personal ");

			
					List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql.toString());
					result = new PersonalDto();
					
					if(!rows.isEmpty()) {
					 list = new ArrayList<PersonalDto>();
						for(Map row : rows) {
							result.setUserID((BigDecimal)row.get("user_id"));
							result.setPersonalID((String)row.get("personal_id"));
							result.setEmployeeCode((String)row.get("employee_code"));
							result.setTitleNameCode((String)row.get("title_name_code"));
							result.setTitleNameTH((String)row.get("title_th"));
							result.setTitleNameEN((String)row.get("title_en"));
							result.setFullNameTH((String)row.get("full_name_th"));
							result.setFullNameEN((String)row.get("full_name_en"));
							result.setOrgCode((String)row.get("org_code"));
							result.setUnitCode((String)row.get("unit_code"));
							result.setPositionName((String)row.get("position_name"));
							result.setUsername((String)row.get("username"));
							result.setPassword((String)row.get("user_password"));
							result.setPin((String)row.get("pin"));
							result.setTouchID((String)row.get("touch_id"));
							result.setDeviceID((String)row.get("device_code"));
							result.setLeaderCode((String)row.get("leader_code"));
							list.add(result);
						}

					}
			
		}catch (Exception e) {
			e.printStackTrace();
		}		
		return list;
	}
	
	public PersonalDto getPersonalDataByEmpNo(PersonalDto dto) {
		if(DataUtils.isBlankValue(dto.getUsername()))
			return null;
		String sql = "select * from tb_personal where username = ?";
		return (PersonalDto)getJdbcTemplate().queryForObject(sql, new Object[]{"005766"}, new RowMapper<PersonalDto>(){
			@Override
			public PersonalDto mapRow(ResultSet rs, int rwNumber) throws SQLException {
				PersonalDto result = new PersonalDto();				
				result.setUserID(rs.getBigDecimal("user_id"));
				result.setPersonalID(rs.getString("personal_id"));
				result.setEmployeeCode(rs.getString("employee_code"));
				result.setTitleNameCode(rs.getString("title_name_code"));
				result.setTitleNameTH(rs.getString("title_th"));
				result.setTitleNameEN(rs.getString("title_en"));
				result.setFullNameTH(rs.getString("full_name_th"));
				result.setFullNameEN(rs.getString("full_name_en"));
				result.setOrgCode(rs.getString("org_code"));
				result.setUnitCode(rs.getString("unit_code"));
				result.setPositionName(rs.getString("position_name"));
				result.setUsername(rs.getString("username"));
				result.setPassword(rs.getString("user_password"));
				result.setPin(rs.getString("pin"));
				result.setTouchID(rs.getString("touch_id"));
				result.setDeviceID(rs.getString("device_code"));
				result.setLeaderCode(rs.getString("leader_code"));
				return result;
			}
		});
	}
	
	public boolean insertPersonal(PersonalDto dto) {
		String sql = "INSERT INTO public.tb_personal("
				+ "	user_id, personal_id, employee_code, title_name_code, full_name_th, full_name_en, " + 
				"org_code, unit_code, position_name, username, user_password, pin, touch_id, device_id, leader_code)"
				+ "	VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		if(isExistUser(dto.getUsername()))
			return false;
		
		
		getJdbcTemplate().update(sql, dto.getUserID(), dto.getPersonalID(), dto.getEmployeeCode(),
				dto.getTitleNameCode(), dto.getFullNameTH(), dto.getFullNameEN(), dto.getOrgCode(), dto.getUnitCode(),
				dto.getPositionName(), dto.getUsername(), dto.getPassword(), dto.getPin(), dto.getTouchID(),
				dto.getDeviceID(), dto.getLeaderCode());

		return false;
	}
	
	public boolean checkUserByPinCodeOrTouchID(PersonalDto dto) {		
		String sql = "select count(1) from tb_personal where username = ? and(pin = ? or touch_id =?)";
		int i = getJdbcTemplate().queryForObject(sql, new Object[]{dto.getUsername(),dto.getPin(),dto.getTouchID()}, Integer.class);		
		return i==1?true:false;		
	}
	
	public void updateDeviceId(String empCode, String deviceId) {
		String sql = "update tb_personal set device_id = ? where username = ?";
		getJdbcTemplate().update(sql, deviceId, empCode);		
	}
	
	public boolean isExistUser(String username) {
		String sql = "select count(1) from tb_personal where username = ?";
		int i = getJdbcTemplate().queryForObject(sql, new Object[]{username}, Integer.class);		
		return i==1?true:false;		
	}
}




