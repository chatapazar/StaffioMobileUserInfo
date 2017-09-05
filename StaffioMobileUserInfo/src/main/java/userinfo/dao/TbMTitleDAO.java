package userinfo.dao;

import java.sql.PreparedStatement;
import java.util.List;

import javax.annotation.PostConstruct;

import userinfo.dto.TitleDto;
import userinfo.utils.DBConnectionUtils;

public class TbMTitleDAO {
	private DBConnectionUtils db;
	

	public void initial() {
		db = DBConnectionUtils.getInstance();
	}
	
	public void insertData(List<TitleDto> list) throws Exception{
		StringBuffer sql = new StringBuffer();
		sql.append("insert into tb_m_title ");
		sql.append("values (?,?,?)");
		db.getConnection().setAutoCommit(false);
		PreparedStatement st = db.getConnection().prepareStatement(sql.toString());
		
		for(TitleDto dto : list) {
//			st.setString(1, dto.getTitleNamNo());
//			st.setString(2, dto.getTitleEn());
//			st.setString(3, dto.getTitleTh());
			st.executeUpdate();
		}
		db.getConnection().commit();
		db.getConnection().setAutoCommit(true);		
	}
	
}
