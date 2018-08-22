package Q3;

public class Employee {
	private String name;
	private char gender;
	private double yearOfExp;
	private String designation;
	private double basicSalary;
	private String status;

	public Employee(String name, char gender) {
		super();
		this.name = name;
		this.gender = gender;

	}

	public Employee(String name, char gender, double yearOfExp, String designation, double basicSalary, String status) {
		super();
		this.name = name;
		this.gender = gender;
		this.yearOfExp = yearOfExp;
		this.designation = designation;
		this.basicSalary = basicSalary;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getYearOfExp() {
		return yearOfExp;
	}

	public void setYearOfExp(double yearOfExp) {
		this.yearOfExp = yearOfExp;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	

	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", yearOfExp=" + yearOfExp + ", designation="
				+ designation + ", basicSalary=" + basicSalary + ", status=" + status + "]";
	}

	public double promoteEmp() {
		String desig = this.getDesignation();
		double sal = this.getBasicSalary();
		switch (desig) {
		case "ASE":
			setBasicSalary(sal + sal * 0.05);
			setDesignation("ITA");
			break;

		case "ITA":
			setBasicSalary(sal + sal * 0.08);
			setDesignation("AST");
			break;

		case "AST":
			setBasicSalary(sal + sal * 0.10);
			setDesignation("ASC");
			break;
		default:
			System.out.println("Wrong input");
		}
		return 0;
	}

	public void applyForLwp() {
		setStatus("INVALID");
		setBasicSalary(0.0);
	}
}
