package Q5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class PrintEmployeeInfo {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "Vipin"));
		empList.add(new Employee(102, "Abhishek"));
		empList.add(new Employee(103, "Rohit"));

		Consumer<Employee> c1 = (Employee e) -> System.out
				.println("Employee id: " + e.getEid() + " Employee Name: " + e.getName());
		
		Consumer<Employee> c2=new Consumer<Employee>() {

			@Override
			public void accept(Employee e) {
				System.out
				.println("Employee id: " + e.getEid() + " Employee Name: " + e.getName());
			}
			
		};
		
		System.out.println("Results using Lambda expression");
		for (Employee employee : empList) {
			c1.accept(employee);
		}
		
		System.out.println("Results using Annonymous class");
		for (Employee employee : empList) {
			c2.accept(employee);
		}
		
	}

}
