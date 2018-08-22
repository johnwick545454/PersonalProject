package com.generics;

public class InterfaceTest {

	public static void main(String[] args) {
		Add a=new Add();
		a.getData(20, 11);
		System.out.println("Sum is: "+a.sum());
	}
}
//concatinate two string object using the generic interface