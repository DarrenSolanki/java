package string_pgms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s1 = sc.nextLine();
		String s2 = "";
		System.out.print("Original String : "+s1);
		System.out.println();
		for(int i = s1.length()-1; i>=0;i--) {
			 s2 +=s1.charAt(i);
		}
		System.out.print("Reversed String : "+s2);
		System.out.println();
		if(s1.equalsIgnoreCase(s2)) {
			
			System.out.println("Given String is a palindrome");
		}
		
		else {
			System.out.println("Given String is not a palindrome");

		}
		
		
	}

}
