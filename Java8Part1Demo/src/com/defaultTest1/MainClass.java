package com.defaultTest1;

public class MainClass{
	
	public static void main(String[] args) {
		Runnable x=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("inside run method");
				
			}
		};
		
		Runnable s1=()->System.out.println("hi");
		s1.run();
		Thread t=new Thread(x);
		t.start();
	}

}
