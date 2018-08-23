package com.store;

public class InvalidPaymentModeException extends Exception {

	public InvalidPaymentModeException() {
		super();
		System.out.println("Not a valid Payment Mode");
	}

	public InvalidPaymentModeException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

	public InvalidPaymentModeException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public InvalidPaymentModeException(String arg0) {
		super(arg0);
	}

	public InvalidPaymentModeException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
}
