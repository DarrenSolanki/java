package Interface;

interface Phone{
	void call(); //access specifier is by default public
	void text();
}

class Boyfriend implements Phone{
	
	public void call() {
		System.out.println("BF : Hi can you hear me?");
	}
	public void text() {
		System.out.println("BF : Can we chat?");
	}
}

class Girlfriend implements Phone{
	
	public void call() {
		System.out.println("GF : No I can't");
	}
	public void text() {
		System.out.println("GF : No I am too busy");
	}
}

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boyfriend b = new Boyfriend();
		b.call();
		Girlfriend g = new Girlfriend();
		g.call();
		b.text();g.text();
	}

}
