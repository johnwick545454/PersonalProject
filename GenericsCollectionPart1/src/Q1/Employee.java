package Q1;

public class Employee {
	private int empid;
	private String empName;
	private String empDept;

	public Employee(int empid, String empName, String empDept) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empDept = empDept;
	}

	public void print() {
		System.out.println("EmpId: " + empid + " EmpName: " + empName + " EmpDept: " + empDept);
	}
}
