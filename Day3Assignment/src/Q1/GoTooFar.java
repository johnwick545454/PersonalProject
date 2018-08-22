package Q1;

public class GoTooFar {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		
		try {
			for(int i=0;i<10;i++){
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("You have gone too far");
		}
		
	}
}
