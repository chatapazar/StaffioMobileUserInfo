package userinfo.service;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import userinfo.dao.TbRoomDAO;
import userinfo.dto.MonthlyReportDto;
import userinfo.dto.RoomDto;

@Service
public class RoomService {


	@Autowired
	TbRoomDAO roomDao;
	
	public List<RoomDto> getAllWaitRoom(){
		return roomDao.getAllWaitRoom();
	}
	
	public List<RoomDto> getAllWaitRoomByPriceRange(BigDecimal startPrice, BigDecimal stopPrice){
		return roomDao.getAllWaitRoomByPriceRange(startPrice, stopPrice);
	}
	
	public RoomDto getRoomDataById(Integer roomId) {
		return roomDao.getRoomDataById(roomId);
	}
	
	public String reserveRoom(Integer roomId, String reserveBy) {
		return roomDao.reserveRoom(roomId, reserveBy);
	}
	
	public List<RoomDto> getAllWaitRoomByLocation(BigDecimal lattitude, BigDecimal longtitude, Integer range) {
		return roomDao.getAllWaitRoomByLocation(lattitude, longtitude, range);
	}
	
	public List<MonthlyReportDto> monthlyReport(String userId) {
		return roomDao.monthlyReport(userId);
	}
	
	public String insertPaySlip(Date payDate, Integer payRoomId, BigDecimal payAmount) {
		return roomDao.insertPaySlip(payDate, payRoomId, payAmount);
	}
	
	public List<RoomDto> getAllRoomByUserId(String userId) {
		return roomDao.getAllRoomByUserId(userId);
	}
}
