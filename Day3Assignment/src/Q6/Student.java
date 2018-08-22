package Q6;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		int[] arr = { 101, 102, 103, 104, 105 };
		int[] score = new int[arr.length];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter marks for"+arr[i]);
			int scr = sc.nextInt();
			score[i] = scr;
			if (scr <= 100) {
				score[i] = scr;
			} else {
				try {
					score[i] = 0;
					throw new ScoreException("Wrong marks entered");

				} catch (ScoreException e) {
				}
				//System.out.println("hello");
			}
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.println("StudentID:"+arr[i]+" Marks:"+score[i]);
		}

	}

}
