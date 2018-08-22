package Q7;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class CustomerData {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		Connection con=utility.Utility.getConnection();
		Statement stmt=con.createStatement();
		String tableName="";
		System.out.println("Enter name");
		String name=sc.nextLine();
		System.out.println("Enter Type");
		String type =sc.nextLine();
		
		if(type.equalsIgnoreCase("reg")){
			tableName="RegularCustomer";
		}else{
			tableName="CorporateCustomer";
		}
		String sql="Insert into "+tableName+" values("+name+","+type+")";
		stmt.executeUpdate(sql);
	}

}
