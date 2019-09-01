package programming;

public class Saturday {

	public static void main(String[] args) {
		
		//Task 1
		String s = "google";
		String replace = s.replace('g', 'd');
		System.out.println("Original word : "+s);
		System.out.println("Replaced word :"+ replace);
		System.out.println();
		
		//Task 2
		String s2="Goog";
		String rev = "";
		System.out.println(s2.length());
		System.out.println("Original String: "+s2);
		for(int i =s2.length()-1;i>=0;i--) {
//			System.out.println(s2.charAt(i));
			rev += s2.charAt(i); 
		}
		System.out.println("Reversed String: "+rev);
		
		//check palindrome
		if(s2.equalsIgnoreCase(rev)) {
			System.out.println("Given string is a palindrome");
		}
		
		else {
			System.out.println("Given string is not a palindrome");
		}
		
	}
	

}
