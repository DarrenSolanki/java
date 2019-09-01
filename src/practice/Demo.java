package practice;

class A{
	 static void m1() {
		System.out.println("m1 of A");
	}
	
	void m2() {
		System.out.println("m2 of A");
	}
	void m3() {
		System.out.println("m3 of A");
	}
}

class B extends A{
	 void mx() {
		System.out.println("mx of B");
	}
	
	void m2() {
		System.out.println("m2 of B");
	}
	
}
public class Demo {

	public static void main(String[] args) {
		
		A b = new B();
		B c = (B)b;
		
		c.m1();
		c.m2();
		b.m1();
		b.m2();
		c.m3();
//		Demo d = new Demo1();
//		Demo1 b = (Demo1)d;
	}

}
