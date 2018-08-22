package p1;

// Create a class
class Employee {

	int id;
	String name;
}

public class MainClass {

	Employee eObj;
	public void doStuff()
	{
		//null.id = 101; 
		eObj.id =101; // code leads to Exception 
	}
	
	
	
	public static void main(String[] args) {

			
		MainClass obj = new MainClass();
		// not req if other methods are static 
	
			
		// obj.doStuff();  // execute that line for NullPointerException
		
		Employee e = new Employee();
		e.id = 101;
		e.name = "mike";
		
		obj.printEmployee(e);
				
		Employee e1 = new Employee();
		e1.id = 102;
		e1.name = "Jenny";
		obj.printEmployee(e1);
		
		
	}// end main
	
	public void printEmployee(Employee e)
	{
		System.out.println(" Employee ID : "+e.id);
		System.out.println(" Employee Name : "+e.name);
		
	}
	
}// enc class













