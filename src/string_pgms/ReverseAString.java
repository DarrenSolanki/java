package string_pgms;

public class ReverseAString {

	public static void main(String[] args) {
		
		String s = "LOVE";
		
		char[] c = s.toCharArray(); //convert to char array
		for(int i =c.length-1; i>=0;i--) {
			System.out.println(c[i]);
		}
		System.out.println();

		System.out.println("without converting to character array");
		String s1 = "GOOGLE";
		System.out.println("Original String: "+s1);
		System.out.print("Reversed String: ");

		for(int i = s1.length()-1; i>=0; i--) {
			System.out.print(s1.charAt(i));
		}
		
	}

}
