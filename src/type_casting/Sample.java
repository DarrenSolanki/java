package type_casting;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Widening
		int a = 10;
		Sample s = new Sample();
		s.test1(a);
		double b =a;
		System.out.println("Value of A is :"+a);
		System.out.println("Value of B is "+b+" (Widening : No data loss)");
		System.out.println();
		
		//Narrowing
		double d = 10.4;
		int c =(int) d;
		System.out.println("Value of D is: " +d);
		System.out.println("Value of C is: " +c+" (Narrowing : data loss)");


	}
	void test1(double x) {
		System.out.println(x*x);
	}

}
