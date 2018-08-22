package com.infogain.setdemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetComparisonDemo {

	public static void main(String[] args) throws ParseException {
		HashSet<String> stringOne = new HashSet<>();
		LinkedHashSet<String> stringTwo = new LinkedHashSet<>();
		TreeSet<String> stringThree = new TreeSet<>();
		TreeSet<Date> date = new TreeSet<>();
		SimpleDateFormat fs = new SimpleDateFormat("yyyy-mm-dd");
		Date[] d1 = new Date[3];
		d1[0] = fs.parse("2018-10-13");
		d1[1] = fs.parse("2022-5-11");
		d1[2] = fs.parse("2012-11-25");
		String alist[] = { "Netapp", "apple", "samsung" };
		for (String str : alist) {
			stringOne.add(str);
			stringTwo.add(str);
			stringThree.add(str);

		}
		for (Date dt : d1) {
			date.add(dt);
		}

		System.out.println("No order" + stringOne);
		System.out.println("with order" + stringTwo);
		System.out.println("Sorted element" + stringThree);
		System.out.println("Date are" + date);
		
		System.out.println("Element using Iterator");
		Iterator<String> itr = stringOne.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
