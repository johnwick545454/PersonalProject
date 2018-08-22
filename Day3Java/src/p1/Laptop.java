package p1;

public class Laptop extends Electronics {
	private String processor;

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public Laptop(int modelid, String brand, int power, String processor) {
		super(modelid, brand, power);
		this.processor = processor;
	}

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(int modelid, String brand, int power) {
		super(modelid, brand, power);
		// TODO Auto-generated constructor stub
	}
	public void printLaptop(Laptop l) {
		System.out.println("Processor is:" + l.getProcessor());
	}

	@Override
	public String toString() {
		return "Laptop [processor=" + processor + "]";
	}

}
