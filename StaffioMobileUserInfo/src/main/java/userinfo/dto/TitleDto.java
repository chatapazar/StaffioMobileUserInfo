package userinfo.dto;

import java.io.Serializable;

public class TitleDto extends SimpleDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4017729532401279842L;
	
	private String  titleNo;
	private String  titleTH;
	private String  titleEN;
	
	
	
	
	public String getTitleNo() {
		return titleNo;
	}
	public void setTitleNo(String titleNo) {
		this.titleNo = titleNo;
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
	
	
	
	
	
	
	

}
