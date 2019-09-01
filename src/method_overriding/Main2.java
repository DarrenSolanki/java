package method_overriding;

class Maruti_Car{
	
	void speed () {
		System.out.println("Running at the speed of 60km");
		
	}
	void girlfriend() {
		System.out.println("Paapa....no girlfriend");
	}
}


class Jaguar_Car extends Maruti_Car{
	
	void speed () {
		System.out.println("Running at the speed of 120km");
		
	}
	void girlfriend() {
		System.out.println("Wow.... many girlfriends");
	}
}

public class Main2 {

	public static void main(String[] args) {
		Jaguar_Car j = new Jaguar_Car();
		j.girlfriend();
		j.speed();
	}

}
