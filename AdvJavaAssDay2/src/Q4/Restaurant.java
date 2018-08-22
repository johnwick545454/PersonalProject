package Q4;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class Restaurant {
	static List<Item> menuList = new ArrayList<Item>();

	static {
		Item i1 = new Item(101, "Paneer Tikka", 12);
		Item i2 = new Item(102, "Chicken Tikka", 2);
		Item i3 = new Item(103, "Fish Tikka", 1);

		menuList.add(i1);// store the object
		menuList.add(i2);
		menuList.add(i3);
		System.out.println("done...");
	
	}
	
public void insertList()
{
	//String query=;
	try {
		 Connection con=utility.Utility.getConnection();
		 PreparedStatement stmt=con.prepareStatement("insert into emp3 values(?,?,?)");  
		for (Item item : menuList) {
			 stmt.setInt(1,item.getItemId());  
			 stmt.setString(2,item.getItemName());
			 stmt.setInt(3, item.getItemPrepTime());
			 stmt.executeUpdate();
			 System.out.println("inserted"+item.getItemId());
		}
		 
		
		
		
	} catch (Exception e) {
	e.printStackTrace();;
	}
}
}

