package type_casting;

class Test1{
	
	double d = 100.0;
	void test1() {
		System.out.println("test1()");
	}
}

class Test extends Test1{
	double d = 4.5;
	void test2() {
		System.out.println("test2()");
	}
}


public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Upcasting
		Test1 t = new Test();
		t.test1();
		System.out.println(t.d);
		
//		Downcasting 
		Test1 t1 = new Test(); // upcasting
		Test d = (Test)t1; //downcast
		
		System.out.println(d.d);
		d.test1();
		d.test2();
		
	}

}
