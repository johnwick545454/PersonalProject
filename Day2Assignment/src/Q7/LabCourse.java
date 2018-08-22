package Q7;

public class LabCourse extends CollegeCourse {

	public LabCourse(String department, int courseNumber, int credit) {
		super(department, courseNumber, credit);
	}

	public void display(String dep) {
		System.out.println("Department:" + getDepartment() + "\n Course Number" + getCourseNumber() + "\n credit" + getCredit()
				+ "\n Fees" + (getFee()+50));
	}
}
