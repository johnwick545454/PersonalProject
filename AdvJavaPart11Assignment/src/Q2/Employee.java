package Q2;

public class Employee {
	String name;
	String dept;
	double salary;
	public Employee(String name, String dept, double salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	public Employee(double salary) {
		
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [dept=" + dept + ", name=" + name + ", salary=" + salary + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
