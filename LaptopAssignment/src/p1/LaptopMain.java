package p1;

import java.util.Scanner;

public class LaptopMain {
	Scanner sc = new Scanner(System.in);
	LaptopRecords laprec=new LaptopRecords();
	
	public static void main(String[] args) {
		LaptopMain lp=new LaptopMain();
		
		while (true) {
			System.out.println("enter choice:");
			System.out.println("1: Add Laptop");
			System.out.println("2: Search Laptop on serial number");
			System.out.println("3: Search laptopn on price");
			int choice = lp.sc.nextInt();
			switch (choice) {
			case 1:
				lp.addLaptop();
				break;
			case 2:
				lp.showLaptopSerial();
				break;
			case 3:
				lp.showLaptopPrice();
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("wrong input");
			}
		}
	}

	public void addLaptop() {
		LaptopMain lp=new LaptopMain();
		
		System.out.println("Enter Serial Number:");
		int serial=Integer.parseInt(lp.sc.nextLine());
		System.out.println("Enter Laptop Name");
		String name=lp.sc.nextLine();
		System.out.println("Enter Cost");
		int cost=Integer.parseInt(lp.sc.nextLine());
		
		//Laptop lap=new Laptop(serial,name,cost);
		
		laprec.addLaptop(new Laptop(serial,name,cost));
		
	}

	public void showLaptopSerial() {
		LaptopMain lp=new LaptopMain();
		
		System.out.println("Enter Serial Number:");
		int serial=lp.sc.nextInt();
		laprec.showLaptopSerial(serial);
	}

	public void showLaptopPrice() {
		LaptopMain lp=new LaptopMain();
		
		System.out.println("Enter Cost low");
		int low=lp.sc.nextInt();
		System.out.println("Enter Cost high");
		int high=lp.sc.nextInt();
		laprec.showLaptopPrice(low, high);
	}

}
