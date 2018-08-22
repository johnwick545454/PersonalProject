package p1;

public class MainClass {

	public static void main(String[] args) {
		MainClass obj = new MainClass();

		Accountant a = new Accountant(101, "Mike", 2000, "Salary Issues");
		obj.printEmployeeDetails(a);

		Developer d = new Developer(102, "Jenny", 2020, "NCR");
		obj.printEmployeeDetails(d);

	}// end main

	public void printEmployeeDetails(Employee e) {

		doEmployeeTask(e);

		if (e instanceof Accountant) {
			Accountant a = (Accountant) e;
			// System.out.println("File Name " + a.getFileName());
			a.doAccountingTask();
		}

		if (e instanceof Developer) {

			Developer d = (Developer) e;
			System.out.println("Project Name  " + d.getProjectName());
			d.doCoding();
		}

	}

	public void doEmployeeTask(Employee e) {
		System.out.println("Employee Name " + e.getName());
		System.out.println("Employee Salary " + e.getSalary());

	}
}// end class
