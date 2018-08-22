package day1;

import java.util.Scanner;

public class TicketNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int last = num % 10;
		num = num / 10;
		int rem = num % 7;
		if (last == rem) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
