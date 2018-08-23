package com.grabAJob;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class GrabJobApp {
	 static TreeSet<JobApplication> applicantsData = new TreeSet<JobApplication>();
	 static List<JobApplication> app=new ArrayList<>();
	public static void main(String[] args) throws Exception {
		GrabJobApp obj = new GrabJobApp();
		Scanner sc=new Scanner(System.in);
		
		
		while (true) {
			System.out.println("1: Search Candidate based on primary skill");
			System.out.println("2: Search candidate based on difference in salary percent");
			System.out.println("3: Sorted List based on year of experience");
			System.out.println("4: Sorted List based on current salary");
			int choice=Integer.parseInt(sc.nextLine());
			
			switch(choice){
			case 1:
				obj.searchPrimarySkill();
				break;
			case 2:
				obj.searchSalaryDifference();
				break;
			case 3:
				//Collections.sort(applicantsData,new YearCompare());
				Collections.sort(app, new YearCompare());
				for (JobApplication string : app) {
					System.out.println(app.get(1).getUsername()+app.get(1).getYearOfExperience());
				}
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
				default:
					System.out.println("invalid input");
				
			}
		}

		// obj.searchSalaryDifference();
	}

	public void searchPrimarySkill() throws Exception {
		Connection con = Utility.getConnection();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Primary Skill:");
		String skill = sc.nextLine();

		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(
				"select j.USERNAME,j.CURRENTSALARY,j.EXPECTEDSALARY,s.SKILL,j.YEAROFEXPERIENCE from JOB_APPLICATION j,SKILLS s where s.USERNAME = j.USERNAME");
		while (rs.next()) {
			if (rs.getString(4).equalsIgnoreCase(skill)) {
				System.out.println("Name: " + rs.getString(1) + " CurrentSalary: " + rs.getInt(2) + " ExpectedSalary: "
						+ rs.getInt(3) + " Skill: " + rs.getString(4) + " Year Of Experience" + rs.getInt(5));
				JobApplication j1=new JobApplication(rs.getString(1), rs.getInt(5), rs.getInt(2), rs.getInt(3), rs.getString(4));
				//System.out.println(j1);
				//applicantsData.add(j1);
				app.add(j1);
				
			}
		}
		con.close();
	}

	public void searchSalaryDifference() throws Exception {
		Connection con = Utility.getConnection();
		Scanner sc = new Scanner(System.in);
		String skill = sc.nextLine();

		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(
				"select j.USERNAME, j.CURRENTSALARY, j.EXPECTEDSALARY, s.SKILL from JOB_APPLICATION j,SKILLS s where s.USERNAME = j.USERNAME ");
		while (rs.next()) {
			int diff = rs.getInt(3) - rs.getInt(2);
			// if (rs.getString(4).equalsIgnoreCase(skill) && (diff*100)\)
			System.out.println(rs.getString(1));

		}
		con.close();
	}
	public void sort(){
		
	}

}
