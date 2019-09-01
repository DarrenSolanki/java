package abstraction;
//to achieve multiple inheritance through interface. In classes multiple inheritance is not allowed by java

interface X{
	void test1();

}

interface Y{
	void test1();

}

public class Sample1 implements X,Y{

		public void test1() {
			System.out.println("Running test1()....");
		}

	
       public void test2() {
			System.out.println("Running test2()....");

		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample1 rv = new Sample1();
		
		rv.test1();
		rv.test2();

	}

}
