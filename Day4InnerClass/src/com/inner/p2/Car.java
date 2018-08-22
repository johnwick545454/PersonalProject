package com.inner.p2;

public class Car {

	int initialPower = 10;
	public void start()
	{
		int someMorePower = 4;
		
		class Engine{
			
			int power = 3;
			
			public int startEngine()
			{
				return power * initialPower * someMorePower;
			}
		}
		
		Engine e = new Engine();
		System.out.println(e.startEngine());
	
	}
}
