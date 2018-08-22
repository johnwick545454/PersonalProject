package Q1;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<>();
		al.add(new Employee("vipin", "Hr", 50000));
		al.add(new Employee("Abhishek", "Manager", 60000));
		al.add(new Employee("Rohit", "Hr", 25000));
		al.add(new Employee("Neeraj", "Manager", 60000));
		
		Stream<Employee> stream=al.stream();
		stream.forEach(System.out::println);
	}

}
