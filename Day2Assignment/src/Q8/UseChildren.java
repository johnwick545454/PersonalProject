package Q8;

import java.util.Scanner;

public class UseChildren {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter Name:");
		//String name=sc.nextLine();
	    Male c=new Male("Abhishek");
	    Female f=new Female("Spriha");
	    c.display();
	    f.display();
	}

}
