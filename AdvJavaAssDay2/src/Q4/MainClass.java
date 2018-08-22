package Q4;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MainClass main = new MainClass();
		Connection con = utility.Utility.getConnection();
		if (con == null) {
			System.out.println("dddc");
		}
		while (true) {
			System.out.println("====MENU====");
			System.out.println("1. show an item:");
			System.out.println("2. search an item:");
			System.out.println("3. update an item:");
			System.out.println("4. add an item:");
			System.out.println("5. delete an item:");
			System.out.println("6. delete all items:");
			System.out.println("7. to initialise menu list");
			System.out.println("0. to exit:");

			int ch = Integer.parseInt(sc.nextLine());
			switch (ch) {
			case 1:

				main.show(con);
				break;
			case 2:
				System.out.println("enter id to be searched: ");
				int id = Integer.parseInt(sc.nextLine());
				main.find(id, con);
				break;
			case 3:
				
					System.out.println("1. to update name: ");
					System.out.println("2. to update prep time: ");
					int ch1=Integer.parseInt(sc.nextLine());
					switch(ch1)
					{
					case 1:
					System.out.println("enter id to be updated: ");
					int id4 = Integer.parseInt(sc.nextLine());
					System.out.println("enter new name of dish");
					String name1 = sc.nextLine();
					main.updateName(id4, name1, con);
						break;
					case 2:System.out.println("enter id to be updated: ");
					int id5 = Integer.parseInt(sc.nextLine());
					System.out.println("enter new name of dish");
					int prepTime = Integer.parseInt(sc.nextLine());
					main.updatePrepTime(id5, prepTime, con);
						break;
					}
				break;
				
			case 4:
				System.out.println("enter id: ");
				int id3 = Integer.parseInt(sc.nextLine());
				System.out.println("enter name: ");
				String name = sc.nextLine();
				System.out.println("enter prep time: ");
				int time = Integer.parseInt(sc.nextLine());
				main.add(id3, name, time, con);
				break;
			case 5:
				System.out.println("enter id to be deleted: ");
				int id1 = Integer.parseInt(sc.nextLine());
				main.delete(id1, con);
				break;
			case 6:
				main.deleteAll(con);
				break;
			case 7:
				Restaurant r = new Restaurant();
				r.insertList();
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong choice");

			}// switch end
		} // while end

	}

	public void show(Connection con) {

		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from emp3");
			while (rs.next()) {
				System.out.print(rs.getInt(1) + " ");
				System.out.print(rs.getString(2) + " ");
				System.out.println(rs.getInt(3) + " ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void find(int id, Connection con) {

		String query = "select * from emp3 where id=" + id;
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			if (rs.next()) {
				System.out.println(
						"id is: " + rs.getInt(1) + " name is :" + rs.getString(2) + " prep time is :" + rs.getInt(3));
			} else {
				System.out.println("rescord dosent exist!");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void updateName(int id, String name, Connection con) {
		String query = "update emp3 set name=? where id=" + id;
		try {

			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, name);
			int i = stmt.executeUpdate();
			System.out.println(i + " records updated");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void updatePrepTime(int id, int prepTime, Connection con) {
		String query = "update emp3 set prepTime=? where id=" + id;
		try {

			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, prepTime);
			int i = stmt.executeUpdate();
			System.out.println(i + " records updated");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void add(int id, String name, int time, Connection con) {
		String query = "insert into emp3 values(?,?,?)";
		try {

			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setInt(3, time);
			int i = stmt.executeUpdate();
			System.out.println(i + " records inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete(int id, Connection con) {
		String query = "delete from emp3 where id=" + id;
		try {
			Statement st = con.createStatement();
			int i = st.executeUpdate(query);
			System.out.println(i + " rows affected");
			/*
			 * ResultSet rs=st.executeQuery("select * from emp3"); while(rs.next()) {
			 * System.out.println("id is: "+rs.getInt(1)+" name is :"+rs.getString(2)
			 * +" prep time is :"+rs.getInt(3)); }
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteAll(Connection con) {
		String query = "delete from emp3";
		try {
			Statement st = con.createStatement();
			int i = st.executeUpdate(query);
			System.out.println(i + " rows affected");
			/*
			 * ResultSet rs=st.executeQuery("select * from emp3"); while(rs.next()) {
			 * System.out.println("id is: "+rs.getInt(1)+" name is :"+rs.getString(2)
			 * +" prep time is :"+rs.getInt(3)); }
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
