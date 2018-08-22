package Q4;

import java.util.Scanner;

public class MainClass {
	Account[] acc = new Account[1000];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MainClass mc = new MainClass();
		int count=0;
		while (true) {
			System.out.println("Enter choice");
			System.out.println("1: New Account");
			System.out.println("2: Deposit amount");
			System.out.println("3: Withdraw amount");
			System.out.println("4: Display Amount");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter choice for new Account");
				System.out.println("1: Saving Account");
				System.out.println("2: Current Account");
				int ch =Integer.parseInt(sc.nextLine());
				
				System.out.println("Enter name");
				String cust_name=sc.nextLine();
				System.out.println("Enter Account number");
				int acc_num=Integer.parseInt(sc.nextLine());
				switch (ch) {
				case 1:
					SavingAccount sa =new SavingAccount();
					sa.setData(cust_name, acc_num, "saving");
					mc.acc[count]=sa;
					break;
				case 2:
					CurrentAccount cu=new CurrentAccount();
					cu.setData(cust_name, acc_num, "current");
					mc.acc[count]=cu;
					break;
				}
				break;
			case 2:
				System.out.println("Enter Deposit amount");
				int depAmount = sc.nextInt();
				mc.acc[count].depositAmmount(depAmount);
				SavingAccount sa=(SavingAccount)mc.acc[count];
				sa.interestCalc(mc.acc[count]);
				break;
			case 3:
				System.out.println("Enter Withdraw amount");
				int wdAmount = sc.nextInt();
				mc.acc[count].withdrawAmount(wdAmount);
				break;
			case 4:
				mc.displayAmount(mc.acc[count]);
				break;
			default:
				System.out.println("wrong input");
			}
		}

	}
	

	public void displayAmount(Account e) {
		System.out.println("customerName:" + e.getCustomerName() + "Account Number:" + e.getAccountNumber() + "Amount:"
				+ e.getAmount());
		
	}

}
