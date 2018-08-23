package com.store;

import java.util.Scanner;

import javax.swing.text.DefaultEditorKit.CutAction;

public class BigBagStoreApp {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		BigBagStoreOperations obj=new BigBagStoreOperations();
		
		
		while(true){

			System.out.println("1: Add Customer");
			System.out.println("2: Display total number of Online customers");
			System.out.println("3: Display total number of Local customers");
			System.out.println("4: Make Payment");
			System.out.println("5: Exit");
			
			int choice=Integer.parseInt(sc.nextLine());
			
			switch(choice){
			case 1:
				System.out.println("Enter CustomerId:");
				int id=Integer.parseInt(sc.nextLine());
				System.out.println("Enter Customer Name:");
				String name=sc.nextLine();
				System.out.println("Enter Customer Type(Local/Online):");
				String type=sc.nextLine();
				obj.addCustomers(new Customer(id,name,type));
				break;
			case 2:
				System.out.println("Total number of Online Customers are: "+obj.countCustomers("online"));
				break;
			case 3:
				System.out.println("Total number of Local customers are: "+obj.countCustomers("local"));
				break;
			case 4:
				try {
					obj.doPayment();
				} catch (InvalidPaymentModeException e) {
				}
				
				break;
			case 5:
				System.exit(0);
				break;
				
				default:
					System.out.println("Invalid input");
			}
		}
		

	}

}
