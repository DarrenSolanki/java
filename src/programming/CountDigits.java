package programming;

public class CountDigits {

	public static void main(String[] args) {

		int i = 10001011;		
		String s = Integer.toString(i);
		System.out.println(s);
		char[] c = s.toCharArray();
		int j = c.length;
		System.out.println(j);
		
		System.out.println(CountDigits.digitCount());
	}
	
	static int digitCount() {
		
		int number = 345;
		int count = 0;
		
		while(number!=0) {
			
			number = number/10;
			count++;
		}
		
		return count;		
	}

}
