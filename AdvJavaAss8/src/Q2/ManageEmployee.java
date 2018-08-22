package Q2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ManageEmployee {
	static List<Employee> employeeList = new LinkedList<>();
	static {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date Date11 = sdf.parse("1995-10-13");
			Date Date22 = sdf.parse("1997-9-19");
			Date Date33 = sdf.parse("1996-2-11");
			employeeList.add(new Employee(101,"vipin",Date11));
			employeeList.add(new Employee(102,"Abhishek",Date22));
			employeeList.add(new Employee(103,"Rohit",Date33));
		} catch (ParseException e) {
		}
		
	}
}
