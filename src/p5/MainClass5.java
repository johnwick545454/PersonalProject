package p5;

import java.util.Scanner;

public class MainClass5 {

	EmployeeRecords er = new EmployeeRecords();
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		MainClass5 runner = new MainClass5();

		while (true) {
			System.out.println(" ====== MENU ======");
			System.out.println("1. Add Employee");
			System.out.println("2. Display All Employee");
			System.out.println("0. EXIT");

			System.out.println("\n\n Enter Choice : ");
			int ch = Integer.parseInt(runner.sc.nextLine());

			switch (ch) {
			case 1:
				runner.insertEmployee();
				break;
			case 2:
				runner.displayAllEmployees();
				break;
			case 0:
				System.exit(0);

			default:
				System.out.println("Wrong Option");
			}// end switch

		} // end while

	}// end main

	public void insertEmployee() {

		System.out.println("Enter ID ");
		int id = Integer.parseInt(sc.nextLine());

		System.out.println("Enter Name ");
		String name = sc.nextLine();

		System.out.println("Enter Salary ");
		int salary = Integer.parseInt(sc.nextLine());

		Employee e = new Employee(id, name, salary);

		er.addEmployee(e);
	}

	public void displayAllEmployees() {
		er.printEmployeeRecords();
	}
}
