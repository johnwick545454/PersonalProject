package utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class Utility {
	static Connection con;
	
	public static Connection getConnection(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		} catch (Exception e) {
		}
		return con;
	}
}
