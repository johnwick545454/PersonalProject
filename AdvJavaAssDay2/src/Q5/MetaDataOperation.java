package Q5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class MetaDataOperation {

	public static void main(String[] args) throws Exception {
		Connection con=utility.Utility.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from employee");
		ResultSet rs=ps.executeQuery();
		ResultSetMetaData rsmd=rs.getMetaData();
		System.out.println(rsmd.getColumnName(1)+"\t"+rsmd.getColumnName(2)+"\t\t"+rsmd.getColumnName(3)+"\t\t"+rsmd.getColumnName(4));
		while(rs.next()){
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getInt(4));
		}

	}

}
