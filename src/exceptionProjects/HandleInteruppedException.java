package exceptionProjects;

public class HandleInteruppedException {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		for(int i=0; i<10;i++) {
			Thread.sleep(1000);
			System.out.println(i);
		}

	}

}
