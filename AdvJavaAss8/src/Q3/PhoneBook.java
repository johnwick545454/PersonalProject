package Q3;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
	static HashMap<String, Integer> hm=new HashMap<>(); 
	public static void main(String[] args) {
		
		PhoneBook pb=new PhoneBook();
		Scanner sc=new Scanner(System.in);
		while(true){
		System.out.println("press 1 to add new phone book entry");
		System.out.println("press 2 to shearch a phonebook");
		System.out.println("press 3 to quit");
		int choice = Integer.parseInt(sc.next());
		
		switch(choice){
		case 1:
			
			addPhoneEntry();
			break;
		case 2:
			
			searchPhoneNumber();
			break;
		case 3:
			
			break;
			default:
				System.out.println("Invalid Input");
		}
		
	}
	}
	public static void addPhoneEntry(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		String name=sc.nextLine();
		System.out.println("Enter phone number");
		int phone=Integer.parseInt(sc.nextLine());
		hm.put(name, phone);
	}
	public static void searchPhoneNumber(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name:");
		String name=sc.nextLine();
		if(hm.containsKey(name)){
			System.out.println("Phone Number is: "+hm.get(name));
		}
		else{
			System.out.println("No entry found");
		}
	}

}
