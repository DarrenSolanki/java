package thread;

public class Jaguar extends Thread {
	
	public void run() {
		
		Thread t1 = Thread.currentThread();
		
		for(int i =1; i<=5; i++) {
			System.out.println(t1.getName()+" "+ i);
			
			try {
				Thread.sleep(2000);
			}
			catch(Exception e){
			System.out.println(e);	
			}
			
		}
	}

	public static void main(String[] args) {
		Jaguar j = new Jaguar();
		j.setName("Jaguar");
		j.start();
	
	}

}
