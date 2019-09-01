package exceptionHandling;

public class NullExcepltion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main starts.");
			String s =null;
			
			try {
			System.out.println(s.equals(null));
		}
		
		catch (NullPointerException e) {
		
			System.out.println(e);
		}
			System.out.println("Main ends");
		

	}

}
