package P1;

public class ManageEmp {

	static Employee[] emp = new Employee[3];
	
	static {
		ContractEmp ep1 = new ContractEmp(101, "vipin", 12, 16000, "cont");
		RecEmp re1 = new RecEmp(102, "abhishek", 14, 12000, "reg");
		RecEmp re2 = new RecEmp(103, "rohit", 18, 16000, "reg");
		emp[0] = ep1;
		emp[1] = re1;
		emp[2] = re2;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			emp[i].print();
		}

	}

}
