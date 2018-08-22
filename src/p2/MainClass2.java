package p2;

import p2.Employee;

public class MainClass2 {

	public static void main(String[] args) {

		Employee e = new Employee();
		/// ------- Part 1 --------------
		
		e.setMyEmployeeData(101,"Mike",2000);
		//e.doPrint();
	
		String empName = e.getEmployeeName();
		int salaryOfEmployee1 = e.tellMeTheSalary();
	
		System.out.println("Employee "+empName+" : Salary "+salaryOfEmployee1);		
				
		// --------- Part 2 (changing the salary by non oops approach)---
		
		int newSalary = salaryOfEmployee1 + 1000;
		System.out.println("Employee "+empName+" : Salary "+newSalary);		
		
		// --------- Part 3 ------------------
		int mikeSalary = e.tellMeTheSalary();
		System.out.println("Employee "+empName+" : Salary "+salaryOfEmployee1);		
		
		// ------ Part 4 (Change salary through OOPS approach) ---
		
		e.changeSalary(2000);
		e.doPrint();
		System.out.println("--------------");
		int x = 34242;
		System.out.println(x);
		System.out.println(e);
		
		
	}
}



















