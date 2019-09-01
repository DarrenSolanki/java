package programming;

import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
		int count=0;
		String[] s = {"hi","baby","shona", "baby","gopal"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s1 =sc.next();
		
		if(s.length>0){
		for(int i = 0;i<s.length;i++) {
			if(s1.equalsIgnoreCase(s[i])) {
				count++;
			}
		}
		
		System.out.println(count);
		}
		else {
			System.out.println("Not found");
		}
		
	}

}
