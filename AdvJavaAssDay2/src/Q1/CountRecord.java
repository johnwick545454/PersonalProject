package Q1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utility.Utility;

public class CountRecord {

	public static void main(String[] args) throws SQLException {
		Connection con=Utility.getConnection();
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from employee");
		int i=0;
		while(rs.next()){
			i++;
			//System.out.println("Total number of records:"+rs.getInt(1)+rs.getString(1));
		}
		System.out.println("Total number of records:"+i);
	}

}
