package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {

	public static void main(String[] args) {
		List<Employee3> alist=new ArrayList<>();
		alist.add(new Employee3("vipin",20));
		alist.add(new Employee3("abhishek",22));
		System.out.println("List before sort"+alist);
		Collections.sort(alist,new AgeComparator());
		System.out.println(alist);
		Collections.sort(alist,new NameComparator());
		System.out.println(alist);
	}

}
