package com.defaultTest;

public interface Person {
	void print();
	default void say(){
		System.out.println("hello");
	}
	static void printAge(){
		System.out.println("Age is 22");
	}
}
