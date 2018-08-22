package p1;

public class Developer extends Employee{
	
	private String projectName;

	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Developer(int id, String name, int salary,String projectName) {
		super(id, name, salary);
		this.projectName = projectName;
	}

	public Developer(String projectName) {
		super();
		this.projectName = projectName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	public void doCoding()
	{
		
		System.out.println(getName()+" is working on "+projectName);
	}

}
