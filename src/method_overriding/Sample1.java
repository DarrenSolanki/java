package method_overriding;

abstract class Sample{
	
	abstract void demo1(String s); // abstract methods can be parameterised.
	abstract void demo2();
}


public class Sample1 extends Sample {
	
	public void demo1(String s) {
		System.out.println("Running demo1() "+s);
		
	}
	
	public void demo2() {
		System.out.println("Running demo2()");

	}

	public static void main(String[] args) {

		Sample s = new Sample1();
		s.demo1("name");
		s.demo2();
	}

}
