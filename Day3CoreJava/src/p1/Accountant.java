package p1;

public class Accountant extends Employee {

	private String fileName;

	public Accountant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Accountant(int id, String name, int salary, String fileName) {
		super(id, name, salary);
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void doAccountingTask() {
		System.out.println(getName() + "Working on : " + fileName);
	}
}
