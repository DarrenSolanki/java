package method_overriding;

abstract class Animal{
	abstract void eat();
	abstract void sleep();
}

abstract class Dog extends Animal{
	
	void sleep() {
		System.out.println("Dog is sleeping");
	}
}

class LittleDog extends Dog{
	
	void eat() {
			System.out.println("Little dog is eating chicken");
		}
}
public class Demo {

	public static void main(String[] args) {
		LittleDog l = new LittleDog();
		l.eat();l.sleep();
		
	}

}
