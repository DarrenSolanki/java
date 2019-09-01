package type_casting;

public class Sample1 {

	public static void main(String[] args) {
		System.out.println(Sample1.test());
		int a = (int)10.10;
		double b = a;
		System.out.println("Value of A : "+a);
		System.out.println("Value of B : "+b);
	}
	
	static double test() {
		int a = (int)100.0f;
		return a;
	}
}
