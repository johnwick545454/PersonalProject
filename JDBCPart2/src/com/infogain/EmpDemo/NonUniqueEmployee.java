package com.infogain.EmpDemo;

public class NonUniqueEmployee extends Exception {

	public NonUniqueEmployee() {
		System.out.println("emp already exist");
			
	}

	public NonUniqueEmployee(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public NonUniqueEmployee(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NonUniqueEmployee(String message) {
		super(message);
		System.out.println(message);
	}

	public NonUniqueEmployee(Throwable cause) {
		super(cause);
	}

}
