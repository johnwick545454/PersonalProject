package com.collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> vc = new Vector<>();
		vc.add("abhi");
		vc.add("rohit");
		
		Iterator<String> itr=vc.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		Enumeration<String> en=vc.elements();
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}

	}

}
