package com.infogain.maindemo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JobObjectHashMap {

	public static void main(String[] args) {
		HashMap<String ,Job> hmap=new HashMap<>();
		hmap.put("SA_REP", new Job("sales Reresentative",10000,15000));
		hmap.put("FI_ACCOUNT", new Job("Accountant",12000,17000));
		hmap.put("IT_PROG", new Job("Programmer",13000,20000));
		Set<String> set=hmap.keySet();
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()){
			String key=itr.next();
			System.out.println(key + " " +hmap.get(key));
		}
	}

}
