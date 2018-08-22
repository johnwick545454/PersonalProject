package Q3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamStringTest {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("vipin","Abhishek","Rohit","Udit","vr");
		
		List<String> names=list.stream().filter(e->e.length()>3).collect(Collectors.toList());
		System.out.println(names);
		
		String nameString=list.stream().map(e->e.toUpperCase()).collect(Collectors.joining(","));
		System.out.println(nameString);
		
		List<Integer> li=Arrays.asList(10,50,40,80,11,16,10);
		
		List<Integer> sqare=li.stream().map(e->e*e).distinct().collect(Collectors.toList());
		System.out.println(sqare);

	}

}
