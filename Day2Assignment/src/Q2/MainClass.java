package Q2;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MainClass mc=new MainClass();
		
		while(true){
		System.out.println(" Enter choice:");
		System.out.println("1: Hourly Worker");
		System.out.println("2: Salaried Worker");
		int choice=sc.nextInt();
		
		switch(choice){
		case 1:
			HourlyWorker h=new HourlyWorker("vipin",4000);
			System.out.println("Enter no of hrs worked:");
			int hr=sc.nextInt();
			h.computePay(hr);
			break;
		case 2:
			SalariedWorker s=new SalariedWorker("abhishek",4500);
			s.computePay(40);
			break;
		case 3:
			System.exit(0);
			break;
			default:
				System.out.println("Wrong Input");
		}
		}
		
	}
	
}
