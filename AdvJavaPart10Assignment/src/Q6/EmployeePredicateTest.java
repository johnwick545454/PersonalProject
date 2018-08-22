package Q6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeePredicateTest {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "Vipin",22));
		empList.add(new Employee(102, "Abhishek",21));
		empList.add(new Employee(103, "Rohit",51));
		empList.add(new Employee(104, "Ritika",22));
		
		System.out.println("Employee info which contains more than five character");
		Predicate<Employee> p1=(Employee e)->e.getName().length()>=5;
		filter(empList, p1);
		System.out.println("Employee info which name start with A");
		Predicate<Employee> p2=(Employee e)->e.getName().charAt(0)=='A';
		filter(empList, p2);
		System.out.println("Employee info which age is greater than or equal to 50");
		Predicate<Employee> p3=(Employee e)->e.getAge()>=50;
		filter(empList, p3);
		System.out.println("Employee info which age is smaller than 40");
		Predicate<Employee> p4=(Employee e)->e.getAge()<40;
		filter(empList, p4);
		System.out.println("Employee info which age is less than 30 and equal to 50");
		Predicate<Employee> p5=(Employee e)->e.getAge()>30 && e.getAge()<50;
		filter(empList, p5);
		
	}
	public static void filter(List<Employee> emp,Predicate<Employee> condition){
		for (Employee employee : emp) {
			if(condition.test(employee)){
				System.out.println(employee.getName());
			}
		}
	}
	
}
