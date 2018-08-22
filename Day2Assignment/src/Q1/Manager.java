package Q1;

import java.util.Scanner;

public class Manager implements Role{
	private String role;
	private String responsibility;
	
	
	
	public String getRoleName(){
		return role;
	}
	
	public String getResponsibility(){
		return responsibility;
	}

	public Manager(String role, String responsibility) {
		super();
		this.role = role;
		this.responsibility = responsibility;
	}
	

	
}
