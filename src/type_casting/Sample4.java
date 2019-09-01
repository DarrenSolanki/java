package type_casting;

class Father{
	void smoke() {
		System.out.println("Occasional smoker...");
	}
}

class Son extends Father{
	void smoke() {
		super.smoke();
		System.out.println("Chain smoker...");
	}
}

public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father f = new Son();
		f.smoke();

	}

}
