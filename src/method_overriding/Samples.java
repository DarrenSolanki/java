package method_overriding;

abstract class A{
	abstract void test1(int a);
	static void test2(String b){
		System.out.println("Value of b is "+b);
	}
	
	void test3() {
		System.out.println("Running test2()");
	}
	
	A(){
		
	}
	
    A(int a){
		
	}
}




public class Samples extends A {

	void test1(int a) {
		System.out.println("The value of A is : "+a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samples s =  new Samples();
		
		s.test1(20);
		s.test2("Testing");
		s.test3();

	}

}
