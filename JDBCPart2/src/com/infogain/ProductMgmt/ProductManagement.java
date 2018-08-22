package com.infogain.ProductMgmt;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ProductManagement {
	static Date date1;
	public void add(Product p) throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		Statement stmt=con.createStatement();
		PreparedStatement ps=con.prepareStatement("insert into product values(?,?,?,?)");
		ps.setInt(1, p.getProductId());
		ps.setString(2, p.getNane());
		ps.setInt(3, p.getPrice());
		
		date1 = new java.sql.Date(p.getManDate().getTime());
		ps.setDate(4, date1);
		ps.execute();
		
	}
}
