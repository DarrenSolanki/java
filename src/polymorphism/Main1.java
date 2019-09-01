package polymorphism;

import java.util.Scanner;

interface Switch{
	void ON();
	void OFF();
}

class Fan implements Switch{
	public void ON() {
		System.out.println("Turning on Fan");
	}
	public void OFF() {
		System.out.println("Turning off Fan");
	}
}

class Bulb implements Switch{
	public void ON() {
		System.out.println("Turning on Bulb");
	}
	public void OFF() {
		System.out.println("Turning off Bulb");
	}
}


public class Main1 {
	
	static Switch data(char ch) {
		if(ch == 'F') {
			return new Fan();
		}
		else {
			return new Bulb();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the device name");
		char a = sc.next().charAt(0);
		
		Switch s = Main1.data(a);
		s.ON();s.OFF();
		
		String w = "name";

	}

}
