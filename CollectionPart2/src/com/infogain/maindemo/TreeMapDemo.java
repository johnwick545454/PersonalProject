package com.infogain.maindemo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<String, String> tm=new TreeMap<>();
		tm.put("vipin", "a");
		tm.put("abhishek", "c");
		tm.put("rohit", "e");
		Set<String > set=tm.keySet();
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()){
			String key=itr.next();
			System.out.println(key + "-- " +tm.get(key));
		}
 	}

}
