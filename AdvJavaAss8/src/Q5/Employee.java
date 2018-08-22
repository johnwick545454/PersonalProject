package Q5;

public class Employee {
	int empNo;
	String empName;
	String empAdd;
	
	public Employee(int empNo, String empName, String empAdd) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empAdd = empAdd;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empAdd=" + empAdd + "]";
	}

	
}
