package Q7;

public class CollegeCourse {
	private String department;
	private int courseNumber;
	private int credit;
	private int fee;

	public CollegeCourse(String department, int courseNumber, int credit) {
		super();
		this.department = department;
		this.courseNumber = courseNumber;
		this.credit = credit;
		this.fee = credit * 120;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public void display(String dep) {
		if (dep.equals("bio") || dep.equals("chm") || dep.equals("cis") || dep.equals("phy")) {
			LabCourse lc = new LabCourse(dep, courseNumber, credit);
			lc.display(dep);
		} else {
			System.out.println("Department:" + department + "\n Course Number" + courseNumber + "\n credit" + credit
					+ "\n Fees" + fee);

		}

	}

}
