package Q2;

public abstract class Worker {
	private String name;
	private int salary;
	
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
	public Worker(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public abstract void computePay(int hours);
}
