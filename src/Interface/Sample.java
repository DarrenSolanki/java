package Interface;

interface Vehicle{
	void speed();
	void color();
	
}

class Jaguar implements Vehicle{
	
	public void speed() {
		System.out.println("Runs at a speed of 300kmph");
	}
	
	public void color() {
		System.out.println("Color is Black");
	}
}

class Audi implements Vehicle{
	
	public void speed() {
		System.out.println("Runs at a speed of 200kmph");
	}
	
	public void color() {
		System.out.println("Color is white");
	}
}

public class Sample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Audi a = new Audi();
		a.color();
		a.speed();

		Jaguar j = new Jaguar();
		j.color();
		j.speed();
	}

}
