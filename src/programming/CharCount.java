package programming;

import java.util.Scanner;

public class CharCount {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.next();
		System.out.println("Enter a character");
		char c = sc.next().charAt(0);
		
		for(int i =0;i< s.length();i++) {
			
			if(c==s.charAt(i)) {
				count++;
			}
			
		}
		System.out.println("Character "+c+" is repeated "+count+ " times");
		
		
	}

}
