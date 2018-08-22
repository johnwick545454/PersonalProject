package p4;

public class MainClass4 {

	public static void main(String[] args) {

		Employee e = new Employee(101,"mike",2000);
		e.changeSalary(1000);
		
		int newSalary = e.getSalary()+1000;
		e.setSalary(newSalary);
	
		
	
	}
}









