package Q1;

import java.util.Scanner;

public class Ceo implements Role{
	private String role;
	private String responsibility;
	
	Scanner sc=new Scanner(System.in);
	
	public String getRoleName(){
		return role;
	}
	
	public String getResponsibility(){
		return responsibility;
	}

	public Ceo(String role, String responsibility) {
		super();
		this.role = role;
		this.responsibility = responsibility;
		
	}

	
}
