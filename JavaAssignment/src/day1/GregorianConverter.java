package day1;

import java.util.Scanner;

public class GregorianConverter {

	public static void main(String[] args) {
		int y,c,R,d,m=0,M;
		int A,B,C,D;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of M:");
		M=sc.nextInt();
		System.out.println("Enter the value of y:");
		y=sc.nextInt();
		//System.out.println("Enter the value of c:");
		//c=sc.nextInt();
		System.out.println("Enter the value of d:");
		d=sc.nextInt();
		
		c=((y-(y%100))/100);
		//System.out.println(c);
		if(M>=3)
			m=M-2;
		else 
			m=M+10;
		
		A=((13*m)-1);
		B=y/4;
		C=c/4;
		D=A+B+C+d+y-2*c;
		R=D%7;
		
		switch(R){
		case 0:
			System.out.println("sunday");
			break;
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		default:
			System.out.println("saturday");
		}
	}
}
