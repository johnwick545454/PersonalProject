package com.store;

public class LocalStepInCustomer extends Customer {
	int maxCreditLimit;

	public LocalStepInCustomer(int cutomerId, String customerName, String customerType, int maxCreditLimit) {
		super(cutomerId, customerName, customerType);
		this.maxCreditLimit = maxCreditLimit;
	}

	public LocalStepInCustomer() {
		super();
		
	}

	public LocalStepInCustomer(int cutomerId, String customerName, String customerType) {
		super(cutomerId, customerName, customerType);
		
	}
	
	
}
