package p1;

import java.util.Scanner;

public class MainClass {
	EmployeeRecords er = new EmployeeRecords();
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		MainClass runner = new MainClass();

		while (true) {

			System.out.println("Select Option:");
			System.out.println("1: Add New Record");
			System.out.println("2: Display All Record");
			System.out.println("3: Exit");
			int choice = runner.sc.nextInt();
			
			switch (choice) {
			case 1:
				runner.insertEmployee();
				break;
			case 2:
				runner.displayAllEmployee();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("wrong input");
			}
		}
	}

	public void insertEmployee() {
		MainClass runner = new MainClass();
		System.out.println("Insert id:");
		int id = Integer.parseInt(runner.sc.nextLine());
		System.out.println("Insert name:");
		String name = runner.sc.nextLine();
		System.out.println("Insert salary:");
		int salary = Integer.parseInt(runner.sc.nextLine());

		Employee e = new Employee(id, name, salary);
		er.addEmployee(e);
	}

	public void displayAllEmployee() {
		er.printEmployeeRecords();
	}

}
