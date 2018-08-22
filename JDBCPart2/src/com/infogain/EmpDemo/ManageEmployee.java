package com.infogain.EmpDemo;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;

public class ManageEmployee {
	static Hashtable<Integer, Employee> ht;
	static {
		 ht=new Hashtable<>();
		ht.put(101, new Employee(101,"vipin","saket nagar","Hr",20000));
	}
	public void printEmployee(){
		 for (int key : ht.keySet()) {
			System.out.println(ht.get(key));
		}
	}
	public void addEmployee(Employee e)throws NonUniqueEmployee{
		if(ht.containsKey(e.getEmp_id())){
			throw new NonUniqueEmployee();
		}else{
		ht.put(e.getEmp_id(), e);
		}
	} 
	public void display() throws NonUniqueEmployee{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee id");
		int id=Integer.parseInt(sc.nextLine());
		
		if(ht.containsKey(id)){
			System.out.println(ht.get(id));
		}
		else{
			
			throw new NonUniqueEmployee("Employee doesn't exist");
			
		}
		
	}
	public void deleteEmployee(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee id");
		int id=sc.nextInt();
		
	}
}
