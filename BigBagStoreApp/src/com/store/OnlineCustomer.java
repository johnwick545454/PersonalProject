package com.store;

public class OnlineCustomer extends Customer{
	String discountCoupon;

	public OnlineCustomer(int cutomerId, String customerName, String customerType, String discountCoupon) {
		super(cutomerId, customerName, customerType);
		this.discountCoupon = discountCoupon;
	}

	public OnlineCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OnlineCustomer(int cutomerId, String customerName, String customerType) {
		super(cutomerId, customerName, customerType);
		// TODO Auto-generated constructor stub
	}

	
	
	
}
