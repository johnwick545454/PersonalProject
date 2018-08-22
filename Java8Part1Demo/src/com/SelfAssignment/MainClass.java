package com.SelfAssignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class MainClass {
	static List<Employee> li;
	static {
		li=new ArrayList<>();
		try {
			System.out.println("ho");
			File f = new File("data.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			Connection con = Utility.getConnection();
			Statement stmt = con.createStatement();
			SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
			
			
			
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				String[] data = line.split(",");
				
				Date d1=sf.parse(data[2]);
				java.sql.Date d2=new java.sql.Date(d1.getTime());
				li.add(new Employee(Integer.parseInt(data[0]), data[1],d2));
				addDataToDatabase(con, Integer.parseInt(data[0]), data[1], d2);
				
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		for (Employee employee : li) {
			System.out.println(employee);
		}
	}

	public static void main(String[] args) {
		System.out.println("1: Add Employee");
		System.out.println("2: Update Employee");
		System.out.println("3: Delete Employee");
	}
	
	public static void addDataToDatabase(Connection con,int id,String name,java.sql.Date date) throws Exception{
		PreparedStatement ps=con.prepareStatement("insert into employee1 values(?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setDate(3, date);
		ps.execute();
	}
	
	public static void add() throws ClassNotFoundException, SQLException, Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee id:");
		int id=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Name");
		String name=sc.nextLine();
		System.out.println("Enter dob");
		String date=sc.nextLine();
		SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
		Date d1=sf.parse(date);
		java.sql.Date d2=new java.sql.Date(d1.getTime());
		
		addDataToDatabase(Utility.getConnection(), id, name, d2);
		li.add(new Employee(id, name, d2));
	}
	public static void update(){
		
	}
	public static void delete(){
		
	}

}
