package Q3;

public class MainClass {

	public static void main(String[] args) {
		MyInterface mi1=()->System.out.println("Test Lamda expression");
		
		MyInterface mi2=new MyInterface() {
			
			@Override
			public void myTest() {
				System.out.println("Test anonnymous class");
			}
		};
		mi1.myTest();
		mi2.myTest();
	}

}
