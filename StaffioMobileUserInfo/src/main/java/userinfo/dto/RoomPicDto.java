package userinfo.dto;

import java.io.Serializable;

public class RoomPicDto extends SimpleDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 949580328186290214L;

	private String roomPicId;
	private String rpName;
	private String description;
	private String fileYear;
	private String department;
	
	public String getRoomPicId() {
		return roomPicId;
	}
	public void setRoomPicId(String roomPicId) {
		this.roomPicId = roomPicId;
	}
	public String getRpName() {
		return rpName;
	}
	public void setRpName(String rpName) {
		this.rpName = rpName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFileYear() {
		return fileYear;
	}
	public void setFileYear(String fileYear) {
		this.fileYear = fileYear;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
