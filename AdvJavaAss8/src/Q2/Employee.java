package Q2;

import java.util.Date;

public class Employee {
	private int empId;
	private String empName;
	private Date dob;
	public Employee(int empId, String empName, Date dob) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dob = dob;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", dob=" + dob + "]";
	}
	
	
}
