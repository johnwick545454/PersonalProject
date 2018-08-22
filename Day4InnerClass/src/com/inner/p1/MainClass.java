package com.inner.p1;

public class MainClass {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.color = "black";
		c.name = "Chevy Sail";
		
		Car.Engine e = c.new Engine();
		e.power = 2000;
		
		Car.Engine.Type t=e.new Type();
		t.ignition=2;
		
		System.out.println(c);
		System.out.println(e);
		System.out.println(t);
	}
}
