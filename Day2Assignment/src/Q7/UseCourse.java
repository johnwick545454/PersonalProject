package Q7;

import java.util.Scanner;

public class UseCourse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Department:");
		String dep=sc.nextLine();
		System.out.println("Enter Course Number");
		int num=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Credit");
		int credit=Integer.parseInt(sc.nextLine());
		
		CollegeCourse cc=new CollegeCourse(dep, num, credit);
		cc.display(dep);
	}

}
