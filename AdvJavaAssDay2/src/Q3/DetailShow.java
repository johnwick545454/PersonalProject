package Q3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DetailShow {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee id:");
		int id=sc.nextInt();
		
		Connection con=utility.Utility.getConnection();
		Statement stmt=con.createStatement();
		String sql="select * from employee";
		ResultSet rs=stmt.executeQuery(sql);

		while(rs.next()){
			if(rs.getInt(1)==id){
				System.out.println("Emp ID:"+rs.getInt(1)+" Name:"+rs.getString(2)+" Desig"+rs.getString(3)+" Salary"+rs.getInt(4));
			}
		}
	}

}
