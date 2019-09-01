package exceptionHandling;

public class MultipleCatchBlocks {

	public static void main(String[] args) {

		System.out.println("Main starts.");
		
		try {
			String s =null;
			System.out.println(s.hashCode());
		}
		
		catch (NullPointerException e) {
		
			System.out.println(e);
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e);
		}
		
		catch (StringIndexOutOfBoundsException e) {
			
			System.out.println(e);
		}	
		System.out.println("Main ends");
	}

}
