package Q8;

import java.util.Scanner;

public class Male extends Child {
	int age;

	public Male(String name) {
		super(name, "M");
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
