package interviewProgramming;

import java.util.Arrays;
public class ReverseWordsOfAString {

	public static void main(String[] args) {

		String s = "I am Darren Solanki";
		String[] s1 = s.split("\\s+");
		System.out.println(Arrays.toString(s1));
		
		for(int i =s1.length-1; i>=0; i--) {
			
			System.out.print(s1[i]);
			System.out.print(" ");
			
		}
	}

}
