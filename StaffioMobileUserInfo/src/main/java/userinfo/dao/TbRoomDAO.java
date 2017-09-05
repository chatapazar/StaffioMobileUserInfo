package userinfo.dao;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import userinfo.dto.MonthlyReportDto;
import userinfo.dto.RoomDto;
import userinfo.dto.RoomPicDto;
import userinfo.utils.DataUtils;

@Repository
public class TbRoomDAO extends JdbcDaoSupport {

	@Autowired
	DataSource dataSource;

	@PostConstruct
	private void initailize() {
		setDataSource(dataSource);
	}
	
	public String reserveRoom(Integer roomId, String reserveBy) {
		String result = "Fail";
		StringBuffer sql = new StringBuffer();
		try {
			sql.append(" UPDATE tb_room "); 
			sql.append(" SET r_status=?, r_reserve_by=?, r_reserve_dt=CURRENT_DATE " + 
					"	WHERE r_id=?");
			getJdbcTemplate().update(sql.toString(), "R", reserveBy, roomId);
			result = "Success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public String insertPaySlip(Date payDate, Integer payRoomId, BigDecimal payAmount) {
		String result = null;
		StringBuffer sql = new StringBuffer();
		UUID id = UUID.randomUUID();
		try {
			sql.append("INSERT INTO public.tb_payment_his( "); 
			sql.append("	pay_date_time, pay_timestamp, pay_room_id, pay_amount, pay_slip)"); 
			sql.append("	VALUES ( ?, CURRENT_DATE, ?, ?, ?)");
			getJdbcTemplate().update(sql.toString(), payDate, payRoomId, payAmount, id);
			result = id.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public List<RoomDto> mapperRoomDto(List<Map<String, Object>> rows) {
		List<RoomDto> list = null;
		RoomDto result = null;
		try {
			if (!rows.isEmpty()) {
				list = new ArrayList<RoomDto>();
				for (Map row : rows) {

					result = new RoomDto();
					result.setId((Integer) row.get("r_id"));
					result.setName((String) row.get("r_name"));
					result.setType((String) row.get("r_type"));
					result.setAddress((String) row.get("r_address"));
					result.setSizeX((String) row.get("r_size_x"));
					result.setSizeY((String) row.get("r_size_y"));
					result.setPrice((BigDecimal) row.get("r_price"));
					result.setDeposit((Integer) row.get("r_deposit"));
					result.setPhone((String) row.get("r_phone"));
					result.setEmail((String) row.get("r_email"));
					result.setStatus((String) row.get("r_status"));
					result.setReserveBy((String) row.get("r_reserve_by"));
					result.setReserveDt((Date) row.get("r_reserve_dt"));
					result.setLatitude((BigDecimal) row.get("r_latitude"));
					result.setLongtitude((BigDecimal) row.get("r_longtitude"));
					result.setOwnerId((String) row.get("r_owner_id"));
					list.add(result);
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	

	public List<RoomDto> getAllWaitRoom() {

		StringBuffer sql = new StringBuffer();
		List<RoomDto> list = null;

		try {
			sql.append("select * from tb_room where r_status = 'W' ");

			List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql.toString());
			list = mapperRoomDto(rows);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List<RoomDto> getAllRoomByUserId(String userId) {

		StringBuffer sql = new StringBuffer();
		List<RoomDto> list = null;

		try {
			sql.append("select * from tb_room where r_reserve_by = '" + userId + "' order by r_name ");

			List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql.toString());
			list = mapperRoomDto(rows);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List<RoomDto> getAllWaitRoomByPriceRange(BigDecimal startPrice, BigDecimal stopPrice) {

		StringBuffer sql = new StringBuffer();
		List<RoomDto> list = null;

		try {
			sql.append("select * from tb_room where r_status = 'W' ");
			sql.append(" and r_price >= " + startPrice.toString());
			sql.append(" and r_price <= " + stopPrice.toString());
			sql.append(" order by r_price asc ");

			List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql.toString());
			list = mapperRoomDto(rows);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List<RoomDto> getAllWaitRoomByLocation(BigDecimal lattitude, BigDecimal longtitude, Integer range) {

		StringBuffer sql = new StringBuffer();
		List<RoomDto> list = null;

		try {
			sql.append("select * "); 
			sql.append(",(select min(rp_id) from tb_room_pic where rp_room_id = r_id) rp_id ");
			sql.append("from tb_room ");
			sql.append("where r_status = 'W' and distance(" + lattitude + "," + longtitude + ",r_latitude,r_longtitude) < " + range); 
			sql.append("order by r_id");

			List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql.toString());
			if (!rows.isEmpty()) {
				list = new ArrayList<RoomDto>();
				for (Map row : rows) {

					RoomDto result = new RoomDto();
					result.setId((Integer) row.get("r_id"));
					result.setName((String) row.get("r_name"));
					result.setType((String) row.get("r_type"));
					result.setAddress((String) row.get("r_address"));
					result.setSizeX((String) row.get("r_size_x"));
					result.setSizeY((String) row.get("r_size_y"));
					result.setPrice((BigDecimal) row.get("r_price"));
					result.setDeposit((Integer) row.get("r_deposit"));
					result.setPhone((String) row.get("r_phone"));
					result.setEmail((String) row.get("r_email"));
					result.setStatus((String) row.get("r_status"));
					result.setReserveBy((String) row.get("r_reserve_by"));
					result.setReserveDt((Date) row.get("r_reserve_dt"));
					result.setLatitude((BigDecimal) row.get("r_latitude"));
					result.setLongtitude((BigDecimal) row.get("r_longtitude"));
					result.setOwnerId((String) row.get("r_owner_id"));
					if(row.get("rp_id")!=null) {
						result.setRoomPics(new ArrayList<RoomPicDto>());
						RoomPicDto pic = new RoomPicDto();
						pic.setRoomPicId((String)row.get("rp_id"));
						result.getRoomPics().add(pic);
					}
					list.add(result);
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public RoomDto getRoomDataById(Integer roomId) {
		RoomDto room = null;
		StringBuffer sqlpic = new StringBuffer();
		List<RoomPicDto> picList = null;
		try {
			if(DataUtils.isBlankValue(roomId))
				return null;
			String sql = "select * from tb_room where r_id = ? ";
			room = (RoomDto)getJdbcTemplate().queryForObject(sql, new Object[]{roomId}, new RowMapper<RoomDto>(){
				@Override
				public RoomDto mapRow(ResultSet rs, int rwNumber) throws SQLException {
					RoomDto result = new RoomDto();				
					result.setId((Integer) rs.getObject("r_id"));
					result.setName((String) rs.getObject("r_name"));
					result.setType((String) rs.getObject("r_type"));
					result.setAddress((String) rs.getObject("r_address"));
					result.setSizeX((String) rs.getObject("r_size_x"));
					result.setSizeY((String) rs.getObject("r_size_y"));
					result.setPrice((BigDecimal) rs.getObject("r_price"));
					result.setDeposit((Integer) rs.getObject("r_deposit"));
					result.setPhone((String) rs.getObject("r_phone"));
					result.setEmail((String) rs.getObject("r_email"));
					result.setStatus((String) rs.getObject("r_status"));
					result.setReserveBy((String) rs.getObject("r_reserve_by"));
					result.setReserveDt((Date) rs.getObject("r_reserve_dt"));
					result.setLatitude((BigDecimal) rs.getObject("r_latitude"));
					result.setLongtitude((BigDecimal) rs.getObject("r_longtitude"));
					result.setOwnerId((String)rs.getObject("r_owner_id"));
					return result;
				}
			});
			if (room!=null && room.getId()!=null) {
				sqlpic.append("select * from tb_room_pic where rp_room_id = " + roomId);
				sqlpic.append(" order by rp_id asc ");

				List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sqlpic.toString());
				if (!rows.isEmpty()) {
					picList = new ArrayList<RoomPicDto>();
					for (Map row : rows) {
						RoomPicDto result = new RoomPicDto();
						result.setRoomPicId((String) row.get("rp_id"));
						result.setRpName((String) row.get("rp_name"));
						picList.add(result);
					}
					room.setRoomPics(picList);

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return room;
	}
	
	public List<MonthlyReportDto> monthlyReport(String userId) {

		StringBuffer sql = new StringBuffer();
		List<MonthlyReportDto> list = null;

		try {
			sql.append("SELECT to_char(pay_date_time,'Mon-YYYY') monthly,sum(pay_amount) amount,to_char(pay_date_time,'YYYY-MM') month_order "); 
			sql.append(" FROM tb_payment_his ");
			sql.append(" INNER JOIN tb_room ON (r_id = pay_room_id) "); 
			sql.append(" where r_owner_id = '" + userId + "'"); 
			sql.append(" group by to_char(pay_date_time,'Mon-YYYY') ,to_char(pay_date_time,'YYYY-MM') order by month_order desc");

			List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql.toString());
			if (!rows.isEmpty()) {
				list = new ArrayList<MonthlyReportDto>();
				for (Map row : rows) {

					MonthlyReportDto result = new MonthlyReportDto();
					result.setMonthly((String) row.get("monthly"));
					result.setAmount((BigDecimal) row.get("amount"));
					
					list.add(result);
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
