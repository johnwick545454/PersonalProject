package p1;

public class EmployeeRecords {
	
	Employee[] emp=new Employee[1000];
	int count=-1;
	
	public void addEmployee(Employee e) {
		emp[++count]=e;
	}

	public void printEmployeeRecords() {
		for(int i=0;i<=count;i++){
			System.out.println("employee id:"+emp[i].getId());
			System.out.println("employee name:"+emp[i].getName());
		
			System.out.println("employee salary:"+emp[i].getSalary());
		
			
		}
	}
}
