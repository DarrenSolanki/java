package polymorphism;


class A{
	void m1() {
		System.out.println("Running m1 of class A");
	}
	
	void m2() {
		System.out.println("Running m2 of class A");
	}
}

class B extends A{
	void m1() {
		System.out.println("Running m1 of class B");
	}
	
	void m2() {
		System.out.println("Running m2 of class B");
	}
}

class C extends A{
	void m1() {
		System.out.println("Running m1 of class C");
	}
	
	void m2() {
		System.out.println("Running m2 of class C");
	}
}

public class Sample {

	public static void main(String[] args) {
		A a1;
		a1 = new A();
		a1.m1();
		a1.m2();
		System.out.println("=================");
		//reinitialise a1 to Y
		a1 =new B(); // X a1 =new Y();  (upcasting)
		a1.m1();
		a1.m2();
		System.out.println("=================");
		//reinitialise a1 to Z
		a1 =new C();
		a1.m1();
		a1.m2();
	}

}
