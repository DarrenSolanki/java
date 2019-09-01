package thread;

public class ThreadSleep {

	public static void main(String[] args) {

		for(int i =0; i<10;i++) {
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

}
