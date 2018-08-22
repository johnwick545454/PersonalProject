package p5;

class Employee
{
	private int id;
	private String name;
	private int salary;
	
	public Employee() {
		System.out.println("Default constructor");
	}
	
	public Employee(int id, String name, int salary) {
		System.out.println("Constructor 2 ");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Employee(String name, int salary) {
		System.out.println("Constructor 3");
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void changeSalary(int newAmount)
	{
		salary += newAmount;
	}
	
	
	
	
}//end class










