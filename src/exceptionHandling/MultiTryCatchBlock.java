package exceptionHandling;

public class MultiTryCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main starts");
		
		try {
			double d = 10/0;
			System.out.println(d);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		try {
			int[] a= {10,30,43};
			System.out.println(a[10]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

		try {
			String s ="Hello";
			System.out.println(s.charAt(20));
			
		}
		catch(StringIndexOutOfBoundsException e) {
			
		}
		
		System.out.println("main ends");
		
	}

}
