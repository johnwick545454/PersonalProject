package Q2;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Company {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1: List sorted byempDOB attribute in ascending order.");
		System.out.println("2: List sorted byempDOB attribute in descending order.");
		int choice=sc.nextInt();
		switch(choice){
		case 1:
			Collections.sort(ManageEmployee.employeeList,new compareAsec());
			System.out.println(ManageEmployee.employeeList);
			break;
		case 2:
			Collections.sort(ManageEmployee.employeeList,new CompareDesc());
			System.out.println(ManageEmployee.employeeList);
			break;
			default:
				System.out.println("Invalid Input");
		}
	}
	
}
