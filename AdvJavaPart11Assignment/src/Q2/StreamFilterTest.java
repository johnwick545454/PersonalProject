package Q2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Q1.Employee;

public class StreamFilterTest {
	static double sal;
	static int hr, man;

	public static void main(String[] args) throws Exception {
		ArrayList<Employee> al = new ArrayList<>();
		al.add(new Employee("vipin", "Hr", 50000));
		al.add(new Employee("Abhishek", "Manager", 60000));
		al.add(new Employee("Rohit", "Hr", 15000));
		al.add(new Employee("Neeraj", "Manager", 70000));
		int identity = 0;

		List<String> dept = al.stream().map(e -> e.getDept()).distinct().collect(Collectors.toList());

		for (String e : dept) {
			System.out.println(e + "  " + al.stream().filter(emp -> emp.getDept().equals(e)).count());
		}

		List<Double> li = al.stream().map(e -> (e.getSalary())).collect(Collectors.toList());
		// System.out.println(li);
		for (Double double1 : li) {
			sal += double1;
		}
		System.out.println(sal);

		// sal=0.0;

		// al.stream().map(e->(sal += e.getSalary()));
		// System.out.println(sal);

		Stream<Employee> stream = al.stream();
		stream.filter((e) -> e.getSalary() > 20000).forEach(System.out::println);
		Stream<Employee> stream2 = al.stream();
		stream2.filter((e) -> e.getSalary() < 20000).forEach(System.out::println);
		Stream<Employee> stream3 = al.stream();
		stream3.filter((e) -> e.getName().startsWith("A")).forEach(System.out::println);

		al.stream().filter((e) -> e.getName().length() > 5).forEach(System.out::println);
		al.stream().map(e -> e.getName().toUpperCase()).forEach(System.out::println);
	}
}
