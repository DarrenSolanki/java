package polymorphism;


class X{
	void m1() {
		System.out.println("Running m1 of class X");
	}
	
	void m2() {
		System.out.println("Running m2 of class X");
	}
}

class Y extends X{
	void m1() {
		System.out.println("Running m1 of class Y");
	}
	
	void m2() {
		System.out.println("Running m2 of class Y");
	}
}

class Z extends X{
	void m1() {
		System.out.println("Running m1 of class Z");
	}
	
	void m2() {
		System.out.println("Running m2 of class Z");
	}
}

public class CallByReference {

	static void data(X c1) {
		c1.m1();
		c1.m2();
	}
	public static void main(String[] args) {
		//Call by reference 
		//newX(); is an object address
		CallByReference.data(new X()); 
		CallByReference.data(new Y());
		CallByReference.data(new Z());

	}

}

