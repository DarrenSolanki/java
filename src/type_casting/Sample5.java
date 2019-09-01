package type_casting;

interface Demo{
	void test();
}

class Demo1 implements Demo{
	public void test() {
		System.out.println("Running test()");
	}
	
	void test1() {
		System.out.println("Running test1()");
	}
}

public class Sample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo d = new Demo1();
		Demo1 b = (Demo1)d;
		d.test();
		b.test();
		b.test1();

	}

}
