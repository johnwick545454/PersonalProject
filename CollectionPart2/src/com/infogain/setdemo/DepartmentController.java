package com.infogain.setdemo;

import java.util.HashSet;
import java.util.Set;

public class DepartmentController {
	Set<Department> departmentSet;
	
	public DepartmentController() {
		departmentSet=new HashSet<Department>();
	}

	void add(){
		departmentSet.add(new Department("Accounting","pune"));
		departmentSet.add(new Department("Finance","Noida"));
		departmentSet.add(new Department("IT","Gurgaon"));
		departmentSet.add(new Department("Human Resource","Banglore"));
	}
	void display(){
		System.out.println("\n**Departments and location**\n");
		for (Department department : departmentSet) {
			System.out.println(department.getName()+"  "+department.getLocation());
		}
	}
	public static void main(String[] args) {
		DepartmentController d=new DepartmentController();
		d.add();
		d.display();
	}
}
