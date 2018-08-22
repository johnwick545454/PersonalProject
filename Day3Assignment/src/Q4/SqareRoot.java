package Q4;

import java.util.Scanner;

public class SqareRoot {

	public static void main(String[] args) {
		System.out.println("Enter number for sqare root:");
		Scanner sc=new Scanner(System.in);
		
		try {
			int num=sc.nextInt();
			if(num<0){
				ArithmeticException a=new ArithmeticException();
				throw a;
			}
			Double a=Math.sqrt(num);
			System.out.println("Sqare root is:"+a);
			
		} catch (ArithmeticException e) {
			System.out.println("Enter Positive values only");
		}
		
		
	}

}
