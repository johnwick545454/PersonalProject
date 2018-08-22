package Q2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws SQLException {
		Connection con=utility.Utility.getConnection();
		String sql="select e_id from employee";
		Statement stmt=con.createStatement();
		
		ResultSet rs=stmt.executeQuery(sql);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int id=sc.nextInt();
		int count=0;
		
		while(rs.next()){
			if(rs.getInt(1)==id){
				System.out.println("Id found");
				count++;
				break;
				
			}
		}
		if(count==0){
			System.out.println("Id not found");
		}
		
	}

}
