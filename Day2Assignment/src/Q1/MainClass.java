package Q1;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		MainClass mc=new MainClass();
		Scanner sc=new Scanner(System.in);
		
		Ceo c=new Ceo("Manage comp","check overall working");
		Manager m=new Manager("Manages projects", "assign projects");
		
		mc.displayManager(m);
		mc.displayCeo(c);

	}
	public void displayManager(Manager m){
		System.out.println(m.getRoleName());
		System.out.println(m.getResponsibility());
		
	}
	public void displayCeo(Ceo c){
		System.out.println(c.getRoleName());
		System.out.println(c.getResponsibility());
	}

}
