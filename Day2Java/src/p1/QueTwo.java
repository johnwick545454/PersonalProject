package p1;

import java.util.Scanner;

public class QueTwo {

	public static void main(String[] args) {
		int years=0;
		double ei,ca=0;
		//double ca=0;
		double interest=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Current Amount in Account:");
		int cr_amount=sc.nextInt();
		
		while(cr_amount>ca){
			System.out.println("Enter Deposit Amount:");
			int dp_amount=sc.nextInt();
			years++;
			ei=dp_amount+ca;
			interest=ei*0.09;
			ca=ei+interest;
			
		}
		System.out.println("Number of years:"+years);
	}

}
