package userinfo.restclient.dto;

import java.io.Serializable;

public class StaffioTitleDto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8720107140416599997L;
	
	private String  TitleNamNo;
	private String  TitleTh;
	private String  TitleEn;
	public String getTitleNamNo() {
		return TitleNamNo;
	}
	public void setTitleNamNo(String titleNamNo) {
		TitleNamNo = titleNamNo;
	}
	public String getTitleTh() {
		return TitleTh;
	}
	public void setTitleTh(String titleTh) {
		TitleTh = titleTh;
	}
	public String getTitleEn() {
		return TitleEn;
	}
	public void setTitleEn(String titleEn) {
		TitleEn = titleEn;
	}
	
	
}
