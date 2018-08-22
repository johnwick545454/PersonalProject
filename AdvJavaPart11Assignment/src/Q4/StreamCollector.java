package Q4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollector {

	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<>();
		al.add(new Employee(101,"vipin"));
		al.add(new Employee(102,"Abhishek"));
		al.add(new Employee(103, "Ritika"));
		al.add(new Employee(104, "Rohit"));
		
		Stream<Employee> stream=al.stream();
		List<Employee> newList=stream.filter(e->e.getEid()%2==0).collect(Collectors.toList());
		System.out.println(newList);
	}

}
