package com.store;

public interface Payment {
	public boolean makePayment(String paymentMode,String name) throws InvalidPaymentModeException;
}
