package userinfo.restclient.dto;

import java.io.Serializable;

public class StaffioLeavePeriodDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2673660250131353008L;
	private String id;
	private String title;
	private String title_EN;
	private String DATA1;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle_EN() {
		return title_EN;
	}
	public void setTitle_EN(String title_EN) {
		this.title_EN = title_EN;
	}
	public String getDATA1() {
		return DATA1;
	}
	public void setDATA1(String dATA1) {
		DATA1 = dATA1;
	}

}
