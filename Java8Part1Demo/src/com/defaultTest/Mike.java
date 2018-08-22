package com.defaultTest;

public class Mike implements Person {

	@Override
	public void print() {
		System.out.println("Print method of Mike class");
		Person.printAge();
	}
	
}
