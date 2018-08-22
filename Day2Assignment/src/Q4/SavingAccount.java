package Q4;

public class SavingAccount extends Account {
	private double interestRate=0.09;
	
	public void interestCalc(Account a){
		int bal=a.getAmount();
		a.setAmount((int)(bal+bal*interestRate));
	}
	
}
