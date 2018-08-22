package P1;

public abstract class Employee implements iPrint {
	private int empId;
	private String name;

	
	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}

	public Employee() {
		super();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
