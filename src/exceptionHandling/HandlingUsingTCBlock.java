package exceptionHandling;

public class HandlingUsingTCBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 10/0;
			System.out.println(a);
		}
		catch(Exception e) {
			
			System.out.println("Please handle exception "+e);
		}
		
		int sum = 10+5;
		System.out.println(sum);
		System.out.println("Main ends");

	}

}
