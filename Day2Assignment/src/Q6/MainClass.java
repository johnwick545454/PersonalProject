package Q6;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] firstString = new char[20];
		char[] secondString = new char[20];
		System.out.println("Enter following details \n Enter First String:");

		firstString = sc.nextLine().toCharArray();
		System.out.println("Enter Second String:");
		secondString = sc.nextLine().toCharArray();

		UserString us = new UserString(firstString, secondString);
		us.copyString();
		us.concatString();
		us.reverseString();
		us.count();
	}

}
