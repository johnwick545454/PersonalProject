package p1;

import java.util.Scanner;

public class ScannerIssue {

	public static void main(String[] ewfwe) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("name : "+name);
		
		System.out.println("Enter ID : ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("id : "+id);
		
		System.out.println("Enter Technology : ");
		String tech = sc.nextLine();
		System.out.println("Tech : "+tech);
		
		System.out.println("Enter Project Code : ");
		int pcode = sc.nextInt();
		System.out.println("Project Code : "+pcode);
		
	}
}
