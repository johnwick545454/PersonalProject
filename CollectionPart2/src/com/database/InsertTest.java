package com.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.utility.ConnectionProvider;

public class InsertTest {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		PreparedStatement ps;
		Connection con=ConnectionProvider.getConnection("hr", "hr");
		Statement stmt=con.createStatement();
		int id=sc.nextInt();
		//int rs=stmt.executeUpdate("insert into employee values ("+id+",'sheetal','manager',15000)");
		String sql="update employee set salary=20000 where e_id=102";
		ps=con.prepareStatement(sql);
		int rs=ps.executeUpdate();
		if(rs>0)
			System.out.println("record inserted");
	}

}
