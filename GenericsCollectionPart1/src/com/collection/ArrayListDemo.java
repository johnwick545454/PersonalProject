package com.collection;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> alist = new ArrayList<String>();
		alist.add("vipin");
		alist.add("abhishek");
		alist.add("rohit");
		/*
		 * for (String string : alist) { System.out.println(string); }
		 */
		ListIterator<String> itr = alist.listIterator();
		//Iterator<String> itr = alist.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		 

		ListIterator<String> litr = alist.listIterator();
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

	}	

}
