package abstraction;

interface C{
	
	void test1();
	static void test2() {
		System.out.println("Hi");
	}
	
//	void test3(){
//		System.out.println("hiii.."); cant develop non static methods inside interface.
//	}
//	No constructors in interface. Only static final methods are allowed.
}
public class B implements C {

	public void test1() {
		System.out.println("Hello..");
	}
	public static void main(String[] args) {

		B vr = new B();
		vr.test1();
		C.test2();
	}

}
