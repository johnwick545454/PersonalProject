package com.infogain.EmpDemo;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ManageEmployee me = new ManageEmployee();
		while (true) {
			System.out.println("1: Add Employee");
			System.out.println("2: Print Employee");
			System.out.println("3: Display specific record");
			System.out.println("4: Delete Employee");

			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1:
				Scanner sc1 = new Scanner(System.in);
				System.out.println("Enter emp id");
				int id=Integer.parseInt(sc.nextLine());
				System.out.println("Enter name");
				String name= sc.nextLine();
				System.out.println("Enter add");
				String add=sc.nextLine();
				System.out.println("Enter dept");
				String dept=sc.nextLine();
				System.out.println("Enter Salary");
				int sal=Integer.parseInt(sc.nextLine());
				
				Employee e = new Employee(id,name,add,dept,sal);
				try {
					me.addEmployee(e);
				} catch (NonUniqueEmployee e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				break;
			case 2:
				me.printEmployee();
				break;
			case 3:
				try {
					me.display();
				} catch (NonUniqueEmployee e1) {
					
				}
				break;
			case 4:
				me.deleteEmployee();
				break;
			default:
				System.out.println("invalid input");
			}
		}

	}

}
