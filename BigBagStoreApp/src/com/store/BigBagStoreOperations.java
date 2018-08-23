package com.store;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BigBagStoreOperations {
	 Map<Integer, Customer> customerData = new HashMap<>();

	public void addCustomers(Customer c) {

		if (c.getCustomerType().equalsIgnoreCase("online")) {
			customerData.put(c.getCutomerId(),
					new OnlineCustomer(c.getCutomerId(), c.getCustomerName(), c.getCustomerType(), "HAPPY24"));
		} else if (c.getCustomerType().equalsIgnoreCase("local")) {
			customerData.put(c.getCutomerId(),
					new LocalStepInCustomer(c.getCutomerId(), c.getCustomerName(), c.getCustomerType(), 10000));
		}

		System.out.println("Data entered Successfully");
	}

	public int countCustomers(String type) {
		// this method returns count of customer present in map
		int count=0;

		if (type.equals("online")) {
			for (int key : customerData.keySet()) {
				if(customerData.get(key).getCustomerType().equalsIgnoreCase("online")){
					count++;
				}
			}
			//return count;
		} else if (type.equals("local")) {
			for (int key : customerData.keySet()) {
				if(customerData.get(key).getCustomerType().equalsIgnoreCase("local")){
					count++;
				}
			}
			//return count;
		}
		return count;
	}

	public void doPayment() throws InvalidPaymentModeException {
		Scanner sc=new Scanner(System.in);
		Customer c=new Customer();
		System.out.println("Enter Customer name:");
		String name=sc.nextLine();
		String[] online={"Internet Banking","PayTm"};
		String[] local={"Internet Banking","PayTm","Cash","Credit"};
		boolean found=false;
		boolean status=false;
		for (int key : customerData.keySet()) {
			
			if(customerData.get(key).getCustomerName().equalsIgnoreCase(name)){
				if(customerData.get(key).getCustomerType().equalsIgnoreCase("local")){
					found=true;
					int choice=0;
					for (String string : local) {
						System.out.println(choice+": "+string);
						choice++;
					}
					int userChoice=Integer.parseInt(sc.nextLine());
					
					//checks whether a valid payment mode is selected or not
					if(userChoice>3){
						throw new InvalidPaymentModeException();
					}
					status=c.makePayment(local[userChoice],name);
					
				}
				else{
					int choice=1;
					for (String string : online) {
						System.out.println(choice+": "+string);
						choice++;
					}
					int userChoice=Integer.parseInt(sc.nextLine());
					//checks whether a valid payment mode is selected or not
					if(userChoice>1){
						throw new InvalidPaymentModeException();
					}
					status=c.makePayment(online[userChoice],name);
					
				}
			}
			
		}
		if(!status){
			try {
				throw new InvalidPaymentModeException();
			} catch (InvalidPaymentModeException e) {
				
			}
			
		}
		if(!found){
			System.out.println("Name not found");
		}
		
		
		
	}
}
