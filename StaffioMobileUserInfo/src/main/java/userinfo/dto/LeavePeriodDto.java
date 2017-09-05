package userinfo.dto;

import java.io.Serializable;

public class LeavePeriodDto extends SimpleDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9072446424512060986L;
	private	String id;
	private String titleTH;
	private String titleEN;
	private String data;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitleTH() {
		return titleTH;
	}
	public void setTitleTH(String titleTH) {
		this.titleTH = titleTH;
	}
	public String getTitleEN() {
		return titleEN;
	}
	public void setTitleEN(String titleEN) {
		this.titleEN = titleEN;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	
}
