package Q3;

import java.util.Scanner;

public class MainClass {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		MainClass mc = new MainClass();
		while (true) {
			System.out.println("Enter choice");
			System.out.println("1: Fresher");
			System.out.println("2: Experienced");
			int choice = mc.sc.nextInt();
			switch (choice) {
			case 1:
				mc.fresher();
				break;
			case 2:
				mc.experienced();
				break;
			case 3:
				
				break;
			default:
				System.out.println("wrong input");
			}
		}

	}

	public void fresher() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Gender M/F");
		char gender = sc1.next().charAt(0);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = sc2.nextLine();
		Employee e = new Employee(name, gender, 0, "ASE", 10000, "ACTIVE");
		System.out.println(e);
		e.promoteEmp();
		System.out.println(e);
	}

	public void experienced() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = sc1.nextLine();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter Gender M/F");
		char gender = sc2.next().charAt(0);
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter Year of experience");
		double yoe = sc3.nextDouble();
		if (yoe >= 3) {
			Employee e = new Employee(name, gender, yoe, "ITA", 15000, "ACTIVE");
			e.promoteEmp();
		}
		else
		{
			Employee e = new Employee(name, gender, yoe, "ASE", 10000, "ACTIVE");
			e.applyForLwp();
		}
		
	}

}
