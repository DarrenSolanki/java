package method_overriding;

 class Sample4{
	
	final void test1() {
		System.out.println("final method");
	}
}
public class Sample2 extends Sample4 {
	
//	final void test1() {
//		System.out.println("final method cant be over ridden");
//	}

	public static void main(String[] args) {

			Sample2 rv = new Sample2();
			rv.test1();
	}

}
