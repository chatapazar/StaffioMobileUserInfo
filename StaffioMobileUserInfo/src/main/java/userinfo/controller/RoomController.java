package userinfo.controller;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import userinfo.dto.MonthlyReportDto;
import userinfo.dto.RoomDto;
import userinfo.service.RoomService;

@RestController
public class RoomController {
	
	@Autowired
	RoomService roomService;
	
	@ResponseBody
	@RequestMapping(value="/getAllWaitRoom", method=RequestMethod.POST)
	public List<RoomDto> getAllWaitRoom(){
		return roomService.getAllWaitRoom();
	}
	
	@ResponseBody
	@RequestMapping(value="/getAllWaitRoomByPriceRange", method=RequestMethod.POST)
	public List<RoomDto> getAllWaitRoomByPriceRange(BigDecimal startPrice, BigDecimal stopPrice){
		return roomService.getAllWaitRoomByPriceRange(startPrice, stopPrice);
	}
	
	@ResponseBody
	@RequestMapping(value="/getRoomDataById", method=RequestMethod.POST)
	public RoomDto getRoomDataById(Integer roomId) {
		return roomService.getRoomDataById(roomId);
	}
	
	@ResponseBody
	@RequestMapping(value="/reserveRoom", method=RequestMethod.POST)
	public String reserveRoom(Integer roomId, String reserveBy) {
		return roomService.reserveRoom(roomId, reserveBy);
	}
	
	@ResponseBody
	@RequestMapping(value="/getAllWaitRoomByLocation", method=RequestMethod.POST)
	public List<RoomDto> getAllWaitRoomByLocation(BigDecimal lattitude, BigDecimal longtitude, Integer range) {
		return roomService.getAllWaitRoomByLocation(lattitude, longtitude, range);
	}
	
	@ResponseBody
	@RequestMapping(value="/monthlyReport", method=RequestMethod.POST)
	public List<MonthlyReportDto> monthlyReport(String userId) {
		return roomService.monthlyReport(userId);
	}
	
	@ResponseBody
	@RequestMapping(value="/insertPaySlip", method=RequestMethod.POST)
	public String insertPaySlip(Date payDate, Integer payRoomId, BigDecimal payAmount) {
		return roomService.insertPaySlip(payDate, payRoomId, payAmount);
	}
	
	@ResponseBody
	@RequestMapping(value="/getAllRoomByUserId", method=RequestMethod.POST)
	public List<RoomDto> getAllRoomByUserId(String userId) {
		return roomService.getAllRoomByUserId(userId);
	}
}
