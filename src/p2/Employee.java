package p2;

class Employee
{
	private int id;
	private String name;
	private int salary;
	

	public void setMyEmployeeData(int id,String name,int salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void changeSalary(int newAmount)
	{
		salary += newAmount;
	}
	
	
	public int tellMeTheSalary(){
		return salary;
	}
	
	public String getEmployeeName()
	{
		return name;
	}
	
	public void doPrint()
	{
		System.out.println("Employee ID "+id);
		System.out.println("Employee Name "+name);
		System.out.println("Employee Salary "+salary);
		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}








