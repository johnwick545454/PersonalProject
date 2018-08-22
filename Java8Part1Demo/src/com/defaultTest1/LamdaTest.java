package com.defaultTest1;

public class LamdaTest {

	public static void main(String[] args) {
		Xyz x = new Xyz() {

			@Override
			public void print() {
				System.out.println("Inside Print");

			}

		};
		x.print();
		Xyz x1 = () -> System.out.println("hi");
		x1.print();
	}
 
}
