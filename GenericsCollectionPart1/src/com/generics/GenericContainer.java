package com.generics;

public class GenericContainer<T> {
	T obj;
	
	public void setObj(T obj){
		this.obj=obj;
	}
	public T getObject(){
		return obj;
	}
	@Override
	public String toString() {
		return "GenericContainer [obj=" + obj + "]";
	}

	public static void main(String[] args) {
		GenericContainer<String> x=new GenericContainer<String>();
		GenericContainer<Integer> gci=new GenericContainer<>();
		x.setObj("vipin");
		System.out.println(x);
		System.out.println(x.getObject());
		gci.setObj(10);
		System.out.println(gci);
	}

}
