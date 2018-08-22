package com.infogain.Jdbc;
import java.sql.*;  
public class JdbcDemo {

	public static void main(String[] args) {
		
		try{  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		  
		Connection con=DriverManager.getConnection(  
		"jdbc:oracle:thin:@localhost:1521:xe","hr","hr");  
		  
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from employee"); 
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+rs.getInt(4));  
		  
		con.close();  
		  
		}catch(Exception e){ System.out.println(e);}  
		  
		}  

	

}
