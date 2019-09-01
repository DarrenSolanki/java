package arrays;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] marks = new int[6]; 
		double sum=0;
		for(int i =0; i<marks.length;i++) {
			System.out.println("Enter marks for "+(i+1)+" subject");
			marks[i] = sc.nextInt();
			sum +=marks[i];
		}
		
		System.out.println("Average of marks :"+sum/marks.length);
		
		System.out.println();
		boolean b[] = {true, false, true, false};
		for(boolean b1:b) {
			System.out.println(b1);
		}
		
		System.out.println();
		String s[] = {"Hi", "How", "are", "you"};
		for(String s1:s) {
			System.out.println(s1);
		}
		
		System.out.println();
		char c[] = {'B', 'A', 'Y', 'X'};
		for(char c1:c) {
			System.out.println(c1);
		}
	}

}
