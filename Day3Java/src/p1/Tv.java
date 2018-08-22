package p1;

public class Tv extends Electronics {
	private int refresh_rate;

	public int getRefresh_rate() {
		return refresh_rate;
	}

	public void setRefresh_rate(int refresh_rate) {
		this.refresh_rate = refresh_rate;
	}

	public Tv(int modelid, String brand, int power, int refresh_rate) {
		super(modelid, brand, power);
		this.refresh_rate = refresh_rate;
	}

	public Tv() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tv(int modelid, String brand, int power) {
		super(modelid, brand, power);
		// TODO Auto-generated constructor stub
	}
	public void printTv(Tv t) {
		System.out.println("Refresh Rate in Hz:" + t.getRefresh_rate());
	}
	
}
