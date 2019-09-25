package interviewProgramming;

public class Palindrome {

	public static void main(String[] args) {
		String str = "Moonnoom";
		String revStr = "";
		
		for(int i =str.length()-1; i>=0; i--) {
			revStr = revStr + str.charAt(i);
		}
		
		if(str.equalsIgnoreCase(revStr)) {
			System.out.println("It is a Palindrome");
		}
		else {
			System.out.println("It is not a Palindrome");
			
		}

	}

}
