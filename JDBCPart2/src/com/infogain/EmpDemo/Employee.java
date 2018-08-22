package com.infogain.EmpDemo;

public class Employee {
	int emp_id;
	String name;
	String add;
	String dept;
	float salary;

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Employee(int emp_id, String name, String add, String dept, float salary) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.add = add;
		this.dept = dept;
		this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", name=" + name + ", add=" + add + ", dept=" + dept + ", salary="
				+ salary + "]";
	}

}
