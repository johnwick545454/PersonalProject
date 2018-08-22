package com.genericsAss;

public class Concatinate implements GenericInterface<String, String> {
	String t;
	String u;
	@Override
	public void getData(String t, String u) {
		this.t=t;
		this.u=u;
	}
	
	public String concatination(){
		return t+u;
	}
}
