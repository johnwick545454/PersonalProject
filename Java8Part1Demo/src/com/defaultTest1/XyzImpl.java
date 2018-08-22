package com.defaultTest1;

public class XyzImpl implements Xyz {

	@Override
	public void print() {
		System.out.println("Inside print method");
	}

	public static void main(String[] args) {
		XyzImpl n=new XyzImpl();
		n.print();

	}

}
