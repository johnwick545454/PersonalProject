package Q5;

public class Employee {
	private int idNum;
	private int hourlyWage;
	
	public Employee(int idNum, int hourlyWage) throws EmployeeException {
		super();
		this.idNum = idNum;
		this.hourlyWage = hourlyWage;
		
		if(hourlyWage<6 || hourlyWage>50){
			String msg="idNum"+idNum+"Hourly Wage is"+hourlyWage+"HOURLY WAGER MUST BE IN 6 AND 50";
			throw new EmployeeException(msg);
		}
		else{
			System.out.println("Object successfully created");
		}
	}
	
	
}
