package Q2;

import java.util.Scanner;

public class CatchException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter value:");
			int num=Integer.parseInt(sc.nextLine());
			System.out.println("Entered number is"+num);
		} catch (NumberFormatException e) {
			System.out.println("Enter number only");
		}
	}

}
