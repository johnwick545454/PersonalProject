package Q3;

import java.util.Scanner;

public class ArrayCreator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array index:");
		
		try {
			
			int index=Integer.parseInt(sc.nextLine());
			int[] arr=new int[index];
			System.out.println("Array created successfully");
			
		}
		catch (NumberFormatException e) {
			System.out.println("Enter number only");
		}
		catch (NegativeArraySizeException e) {
			System.out.println("Enter only positive values");
		}
		
	}

}
