package thread;

public class CurrentThreadMethod {

	public static void main(String[] args) {

		Thread t1 = Thread.currentThread();
		
		System.out.println(t1.getId());
		System.out.println(t1.getPriority());
		System.out.println(t1.getName());
		System.out.println(t1.isDaemon());
		
		t1.setPriority(10);
		t1.setName("Darren");
		
		System.out.println("======================");
		System.out.println(t1.getId());
		System.out.println(t1.getPriority());
		System.out.println(t1.getName());
		System.out.println(t1.isDaemon());

	}

}
