package Q8;

import java.util.Scanner;

public class Female extends Child {
int age;
	public Female(String name){
		super(name,"F");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age");
		age = sc.nextInt();
	}

	@Override
	public void setAge() {
		setAge(age);
		
	}

	@Override
	public void display() {
		System.out.println("Name:"+getName()+" Age"+age+" Gender:"+getGender());
	}

}
