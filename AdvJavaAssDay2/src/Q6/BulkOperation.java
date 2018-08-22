package Q6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BulkOperation {

	public static void main(String[] args) throws SQLException {
		Connection con=utility.Utility.getConnection();
		String query="update employee set salary=((salary)+(salary*0.15))";
		PreparedStatement ps=con.prepareStatement(query);
		int i=ps.executeUpdate();
		if(i>1){
			System.out.println("Record updated");
		}

	}

}
