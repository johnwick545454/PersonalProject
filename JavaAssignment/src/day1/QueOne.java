package day1;

import java.util.Scanner;
//Question four
public class QueOne {
	public static void main(String[] args) {
		int sum=0;
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int result=num;
		int[] arr=new int[10];
		for(int i=0;i<10;i++){
			result=num%10;
			arr[i]=result;
			num=num/10;
		}
		for (int i=0;i<10;i++) {
			if(i!=6)
				sum=sum+arr[i];
			
		}
		if(sum%10==arr[6]){
			System.out.println("correct account number");
		}
		else{
			System.out.println("wrong account number");
		}
	}
}
