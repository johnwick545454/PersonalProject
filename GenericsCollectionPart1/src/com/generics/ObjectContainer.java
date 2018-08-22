package com.generics;

import java.awt.List;
import java.util.LinkedList;

public class ObjectContainer {
	private Object obj;
	public void setObj(Object obj){
		this.obj=obj;
	}
	public Object getObject(){
		return obj;
	}
	public static void main(String[] args) {
		ObjectContainer obj1=new ObjectContainer();
		obj1.setObj("ravi");
		System.out.println("string is:"+obj1.getObject());
		obj1.setObj(10);
		System.out.println("number is:"+obj1.getObject());
		int num=(Integer)obj1.getObject();
		System.out.println(num);
		GenericContainer<Integer> gci=new GenericContainer<>();
		

	}

}
