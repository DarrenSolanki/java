package encapsulation;

class B{
	private int a = 10;
	private double b = 100.5;
	
	int getA() {
		return a;
	}
	
	double getB() {
		return b;	
	}
	
	void setC(int b1, double b2) {
		a= b1;
		b= b2;
	}
}

public class A {

	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.getA()+" "+b.getB());
		
		System.out.println("=====================");
		b.setC(25, 2500);
		System.out.println(b.getA()+" "+b.getB());

		
	}

}
