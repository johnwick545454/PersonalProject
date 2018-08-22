package P1;

public class ContractEmp extends Employee{
	private int hrsWorked;
	private int salary;
	private String type;
	
	public void print() {
		System.out.println(getEmpId()+getName()+hrsWorked+salary+type);
	}

	public ContractEmp(int empId, String name, int hrsWorked, int salary, String type) {
		super(empId, name);
		this.hrsWorked = hrsWorked;
		this.salary = salary;
		this.type = type;
	}

	public ContractEmp() {
		super();
	}

	public ContractEmp(int empId, String name) {
		super(empId, name);
	}
	
}
