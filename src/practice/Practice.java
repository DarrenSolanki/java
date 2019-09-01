package practice;

interface demo {
	void m1();
	void m2();
	static void m3() {
		System.out.println("m3 of demo interface");
	}
	
}

class Demo1 implements demo{
	public void m1() {
		System.out.println("m1 of class demo1");
	}
	
	public void m2() {
		System.out.println("m2 of class demo1");
	}
	
	void m4() {
		System.out.println("m4 of demo1");
	}
}

class Demo2 extends Demo1{
	public void m1() {
		super.m1();
		super.m2();
		System.out.println("m1 of class demo2");
	}
	
	public void m2() {
		System.out.println("m2 of class demo2");
	}
	
	void m5() {
		System.out.println("m5 of demo2");
	}
}


public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d =(Demo1) new Demo2();
		d.m1();
		d.m2();
		d.m4();
		
		
	}

}
