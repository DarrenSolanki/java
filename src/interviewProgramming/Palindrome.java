package interviewProgramming;

public class Palindrome {

	public static void main(String[] args) {
		String s = "moonnoom";
		String rev = "";
		
		for(int i =s.length()-1; i>=0; i--) {
			rev = rev + s.charAt(i);
		}
		
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("It is a Palindrome");
		}
		else {
			System.out.println("It is not a Palindrome");
			
		}

	}

}
