package exceptionHandling;

public class UsingFinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main starts.");
		
		try {
			String s =null;
			System.out.println(s.hashCode());
		}
		
//		catch (Exception e) {
//		
//			System.out.println(e);
//		}
		
		finally {
			System.out.println("Finally executed");
		}
		
		System.out.println("Main ends");

	}

}
