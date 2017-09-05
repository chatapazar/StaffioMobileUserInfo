package userinfo.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;


public class RoomDto extends SimpleDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1214649942141878905L;
	
	private Integer id;
	private String type;
	private String name;
	private String address;
	private String sizeX;
	private String sizeY;
	private BigDecimal price;
	private Integer deposit;
	private String phone;
	private String email;
	private String status;
	private String reserveBy;
	private Date reserveDt;
	private BigDecimal latitude;
	private BigDecimal longtitude;
	private String ownerId;
	private List<RoomPicDto> roomPics;
	
	
	public String getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	public List<RoomPicDto> getRoomPics() {
		return roomPics;
	}
	public void setRoomPics(List<RoomPicDto> roomPics) {
		this.roomPics = roomPics;
	}
	public BigDecimal getLatitude() {
		return latitude;
	}
	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}
	public BigDecimal getLongtitude() {
		return longtitude;
	}
	public void setLongtitude(BigDecimal longtitude) {
		this.longtitude = longtitude;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSizeX() {
		return sizeX;
	}
	public void setSizeX(String sizeX) {
		this.sizeX = sizeX;
	}
	public String getSizeY() {
		return sizeY;
	}
	public void setSizeY(String sizeY) {
		this.sizeY = sizeY;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Integer getDeposit() {
		return deposit;
	}
	public void setDeposit(Integer deposit) {
		this.deposit = deposit;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getReserveBy() {
		return reserveBy;
	}
	public void setReserveBy(String reserveBy) {
		this.reserveBy = reserveBy;
	}
	public Date getReserveDt() {
		return reserveDt;
	}
	public void setReserveDt(Date reserveDt) {
		this.reserveDt = reserveDt;
	}

	

}
