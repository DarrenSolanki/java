package polymorphism;

class P {
	 void n1() {
		System.out.println("m1 of P");
	}
	 void n2() {
		System.out.println("m1 of P");
	}
}

class Q extends P{
	 void n1() {
		System.out.println("m1 of Q");
	}
	 void n2() {
		System.out.println("m1 of Q");
	}
}

class R extends P{
	
	 void n1() {
		System.out.println("m1 of R");
	}
	 void n2() {
		System.out.println("m1 of R");
	}
}

public class PCallbyRef {

	static void data(){
		
		
		
	}
	public static void main(String[] args) {
		
		R a = new R();
		a.n1();
		a.n2();

	}

}
