package com.infogain.maindemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class JobHashMap {

	public static void main(String[] args) {
		HashMap<String, String> hmap=new HashMap<>();
		hmap.put("SA_REP", "sales Reresentative");
		hmap.put("FI_ACCOUNT", "Accountant");
		hmap.put("SA_MAN", "Sales Manager");
		hmap.put(null, "programmer");
		String jobTitle=hmap.get("SA_MAN");
		System.out.println(jobTitle);
		
		for (String key : hmap.keySet()) {
			System.out.println(key+ " " +hmap.get(key));
		}
		Set<String> set=hmap.keySet();
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()){
			String key=itr.next();
			System.out.println(key + " " +hmap.get(key));
		}
	}

}
