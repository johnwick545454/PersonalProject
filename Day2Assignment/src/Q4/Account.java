package Q4;

public class Account {
	private String customerName;
	private int accountNumber;
	private String typeOfAccount;
	private int amount;
	
	public void setData(String cust_name,int acc_num,String toa){
		customerName=cust_name;
		accountNumber=acc_num;
		typeOfAccount=toa;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getTypeOfAccount() {
		return typeOfAccount;
	}

	public void setTypeOfAccount(String typeOfAccount) {
		this.typeOfAccount = typeOfAccount;
	}
	
	public void depositAmmount(int amt){
		this.amount +=amt;
	}
	
	public void withdrawAmount(int amt){
		this.amount-=amt;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
