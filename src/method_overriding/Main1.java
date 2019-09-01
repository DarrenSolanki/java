package method_overriding;

class Father{
	
	void smoke () {
		System.out.println("Ocational smoker");
		
	}
	void drinks() {
		System.out.println("Regular drinker");
	}
}


class Son extends Father{
	
	void smoke () {
		super.smoke();
		System.out.println("Chain smoker");
		
	}
	void drinks() {
		super.drinks();
		System.out.println("Heavy drinker");
	}
}

public class Main1 {

	public static void main(String[] args) {
		Son s = new Son();
		s.drinks();
		s.smoke();
		
	}

}
