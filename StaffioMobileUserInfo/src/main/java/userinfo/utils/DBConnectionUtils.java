package userinfo.utils;

import java.security.GeneralSecurityException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnectionUtils {
	
	private static DBConnectionUtils instance = null;
	private Connection connection ;
	private String host;
	private String port;
	private String dbname;
	private String username;
	private String password;
	
	public DBConnectionUtils() {
		host = "192.168.28.131";
		port = "5432";
		dbname = "userinfoDB";
		username = "postgres";
		password = "password";
		connect();
	}
	
	public static DBConnectionUtils getInstance() {
		if(instance == null) {
			instance = new DBConnectionUtils();			
		}
		return instance;
	}
	
	private void connect() {
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://" + host + ":" + port + "/" + dbname , username, password);
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;
		}
	}
	
	public boolean isConnect() {
		if (connection != null) 
			return true;
		
		return false;
			
		
	}

//	public static void main(String[] argv) throws SQLException {
//		System.out.println("-------- PostgreSQL " + "JDBC Connection Testing ------------");
//		try {
//			Class.forName("org.postgresql.Driver");
//		} catch (ClassNotFoundException e) {
//			System.out.println("Where is your PostgreSQL JDBC Driver? " + "Include in your library path!");
//			e.printStackTrace();
//			return;
//		}
//
//		System.out.println("PostgreSQL JDBC Driver Registered!");
//	
//
//		if (connection != null) {
//			System.out.println("You made it, take control your database now!");
//			int foovalue = 500;
//			PreparedStatement st = connection.prepareStatement("SELECT * FROM userinfo ");
//		
//			ResultSet rs = st.executeQuery();
//			while (rs.next())
//			{
//			    System.out.print("Column 1 returned ");
//			    System.out.println(rs.getString(1));
//			}
//			rs.close();
//			st.close();
//		} else {
//			System.out.println("Failed to make connection!");
//		}
//	}
	
	public Connection getConnection() {
		if(!isConnect())
			connect();
		return connection;
	}

}
