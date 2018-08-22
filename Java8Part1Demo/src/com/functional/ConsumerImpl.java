package com.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerImpl implements Consumer<String>{
	
	
	@Override
	public void accept(String t) {
		System.out.println(t);		
	}

	public static void main(String[] args) {
		List<String> mylist=Arrays.asList("rohit","abhi","vipin");
		ConsumerImpl c=new ConsumerImpl();
		//mylist.forEach(c);
		Consumer<String> c1=(String i)->System.out.println(i);
		mylist.forEach(c1);
		//c1.accept("vipin");
	}
}
