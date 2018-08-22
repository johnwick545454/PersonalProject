package Q2;

public class HourlyWorker extends Worker {
	float amount;
	public HourlyWorker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HourlyWorker(String name, int salary) {
		super(name, salary);
		this.amount=salary;
		// TODO Auto-generated constructor stub
	}

	public void computePay(int hours){
		//int amount=100;
		double pay=0;
		if(hours>40){
			pay=amount*40*((hours-40)*1.5);
			System.out.println("Total salary"+pay);
		}
		else{
			pay=amount*(hours*1.5);
			System.out.println("Total salary"+pay);
		}
		
	}
}
