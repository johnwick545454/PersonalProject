package p1;

import java.util.Scanner;

public class Investment {

	public static void main(String[] args) {
		Investment i=new Investment();
		i.returnPlus();

	}
	public void returnPlus(){
		Scanner sc=new Scanner(System.in);
		double prAmount=0.0;
		double crAmount,saving=0.0;
		
		for(int i=0;i<3;i++){
			System.out.println("Enter current Saving");
			crAmount=sc.nextDouble();
			
			prAmount=prAmount+(prAmount*0.02);
			System.out.println(prAmount);
			crAmount=crAmount+(crAmount*0.05);
			
			System.out.println("Total saving"+(prAmount+crAmount));
			prAmount=prAmount+crAmount;
		}
	}

}
