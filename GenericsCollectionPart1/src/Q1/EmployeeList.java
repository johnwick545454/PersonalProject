package Q1;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeList {
	public static void main(String[] args) {
		ArrayList<Employee> elist=new ArrayList<Employee>();
		elist.add(new Employee(101,"vipin","Hr"));
		elist.add(new Employee(102,"abhishek","IT"));
		Iterator<Employee> itr=elist.iterator();
		while(itr.hasNext()){
			itr.next().print();
		}
		for (Employee employee : elist) {
			employee.print();
		}
	}
}
