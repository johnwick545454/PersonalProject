package com.infogain.callabedemo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallabeDemo {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "hr", "hr");
		String hr = "Hr";
		CallableStatement cs2 = con.prepareCall("{call MYPROC1('" + hr + "')}");
		// cs2.setString(1,"Hr");
		cs2.execute();
		System.out.println("record deleted");
	}
}
