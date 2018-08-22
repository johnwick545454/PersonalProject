package Q2;

import java.util.Comparator;

public class CompareDesc implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.getDob().compareTo(o1.getDob());
	}

}
