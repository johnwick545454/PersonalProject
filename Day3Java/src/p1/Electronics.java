package p1;

public class Electronics {
	private int modelid;
	private String Brand;
	private int power;

	public Electronics(int modelid, String brand, int power) {
		super();
		this.modelid = modelid;
		Brand = brand;
		this.power = power;
	}

	public Electronics() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getModelid() {
		return modelid;
	}

	public void setModelid(int modelid) {
		this.modelid = modelid;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

}
