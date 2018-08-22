package Q5;

import java.util.Enumeration;
import java.util.Vector;

public class MainClass {
	static Vector<Employee> emp=new Vector<>();
	public static void main(String[] args) {
		
		addInput();
		display();
	}
	public static void addInput(){
		emp.add(new Employee(101,"vipin","bhopal"));
		emp.add(new Employee(102,"abhishek","ajmer"));
	}
	public static void display(){
		Enumeration<Employee> e=emp.elements();
		for (Employee employee : emp) {
			System.out.println(employee);
		}
		
		
	}

}
