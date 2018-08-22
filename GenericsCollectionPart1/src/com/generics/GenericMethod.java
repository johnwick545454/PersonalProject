package com.generics;

public class GenericMethod {
	
	public static <E> void print(E[] e) {
		for (E e2 : e) {
			System.out.println(e2 + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[] num = { 20, 30, 50 };
		print(num);
		Character[] stream={'J','A','V','A'};
		print(stream);
	}

}
