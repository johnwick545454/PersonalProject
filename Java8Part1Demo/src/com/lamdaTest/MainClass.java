package com.lamdaTest;

public class MainClass {
	
	public static void main(String[] args) {
		MathOperation l1=(x,y)-> x+y;
		
		MathOperation1 l2=(x,y)->x-y;
		
		int a=l1.operation(5,7);
		printable p=()->System.out.println(a);
		p.disp();
		
	}
	
}
