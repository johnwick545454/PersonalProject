package p1;

public class MainClass {

	public static void main(String[] args) {
		MainClass obj = new MainClass();

		Tv t = new Tv(11101, "sony", 300, 200);
		obj.printDetails(t);
		Laptop l1 = new Laptop(2053, "dell", 500, "i5 8th Gen");
		Laptop l2 = new Laptop(2487, "acer", 500, "i7 8th Gen");
		obj.printDetails(l1);
		obj.printDetails(l2);
	}

	public void printDetails(Electronics e) {
		doElectronics(e);

		if (e instanceof Laptop) {
			Laptop l = (Laptop) e;
			l.printLaptop(l);
		}
		if (e instanceof Tv) {
			Tv t = (Tv) e;
			t.printTv(t);
		}
	}

	public void doElectronics(Electronics e) {
		System.out.println("model id:" + e.getModelid());
		System.out.println("Brand Name:" + e.getBrand());
		System.out.println("Power in watt:" + e.getPower());
	}
}
