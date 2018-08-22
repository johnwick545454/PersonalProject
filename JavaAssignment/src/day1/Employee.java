package day1;

import java.util.Scanner;

public class Employee {
	float hr_pay;
	int hr_reg;
	int hr_over;
	float result;
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.GetData();
		emp.CalculateSalary();
		emp.Display();
	}
	
	void GetData(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Insert hr Pay");
		hr_pay=sc.nextInt();
		System.out.println("Insert hr Reg");
		hr_reg=sc.nextInt();
		System.out.println("Insert hr overtime");
		hr_over=sc.nextInt();
	}
	void CalculateSalary(){
		result=(float)(hr_pay*(hr_reg+1.5*hr_over));
	}
	void Display(){

		System.out.println("total salaryis: "+result+"hr_pay is: "+hr_pay+" hr_reg is: "+hr_reg+" hr_over: "+hr_over);
	}

}
