package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	static Connection con=null;
	
	public static Connection getConnection(String user,String pass){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",user,pass);
		} catch (Exception e) {
		}
		
		return con;
	}
}
