package p5;

public class EmployeeRecords {

	Employee arr[] = new Employee[1000];
	int counter = -1;
	
	public void addEmployee(Employee e)
	{
		arr[++counter] = e;
	}
	
	public void printEmployeeRecords()
	{
		for(int i=0;i<=counter;i++)
		{
			System.out.println("Emp ID : "+arr[i].getId());
			System.out.println("Emp Name : "+arr[i].getName());
			System.out.println("Emp Salary : "+arr[i].getSalary());
			System.out.println("--------------------------------");
			
		}
	}
}
