package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionTest {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("abhishek");
		al.add("rohit");
		al.add("vipin");
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
	}

}
