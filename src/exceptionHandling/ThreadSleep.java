package exceptionHandling;

public class ThreadSleep {

	public static void main(String[] args) {
		
		System.out.println("Main starts");
		
		try {
			for(int i = 0; i<10; i++) {
				Thread.sleep(3000);
				System.out.println(i);
				
			}
		}
		catch (Exception e) {
			System.out.println(e);		
		}
		
		System.out.println("Main ends");
	}

}
