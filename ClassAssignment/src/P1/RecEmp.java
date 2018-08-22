package P1;

public class RecEmp extends Employee {
	private int hrsWorked;
	private int salary;
	private String type;
	
	
	
	@Override
	public void print() {
		
		System.out.println(getEmpId()+getName()+hrsWorked+salary+type);
	}
	public RecEmp(int empId, String name, int hrsWorked, int salary, String type) {
		super(empId, name);
		this.hrsWorked = hrsWorked;
		this.salary = salary;
		this.type = type;
	}
	public RecEmp() {
		super();
		
	}
	public RecEmp(int empId, String name) {
		super(empId, name);
		
	}
	
	
}
