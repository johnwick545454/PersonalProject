package com.store;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Customer implements Payment {
	private String customerName;
	private String customerType;
	private int cutomerId;

	@Override
	public boolean makePayment(String paymentMode,String name) throws InvalidPaymentModeException {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount to be Paid");
		int amount=Integer.parseInt(sc.nextLine());
		try {
			File f=new File(name);
			FileWriter fw=new FileWriter(f);
			BufferedWriter bw=new BufferedWriter(fw);
			DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
			Date d=new Date();
			bw.write("Date of Bill: "+df.format(d)+"\n"+"Amount: "+amount+" Rs.\n"+"Payment Mode: "+paymentMode );
			bw.close();
		} catch (Exception e) {
		}
		
		return true;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public int getCutomerId() {
		return cutomerId;
	}

	public void setCutomerId(int cutomerId) {
		this.cutomerId = cutomerId;
	}

	public Customer(int cutomerId, String customerName, String customerType) {
		super();
		this.customerName = customerName;
		this.customerType = customerType;
		this.cutomerId = cutomerId;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
