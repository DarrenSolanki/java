package method_overriding;

class Person{
	String name; // non-static & global variable
	int age; //non-static variable
	
	Person(String name, int age){
		this.name = name;
		this.age=age;
		
	}
	
	void display() {
		System.out.println("Name is : "+name+"\n"+"Age is :"+age);
		
	}
	
	
}

public class Trainer extends Person {
	
	String subject;
	int salary;
	Trainer(String name, int age, String subject, int salary){
		super(name, age);
		this.subject = subject;
		this.salary=salary;
	}
	
	void display() {
		super.display();
		System.out.println("Subject is : "+subject+"\n"+"Salary is :"+salary);
		
	}

	public static void main(String[] args) {
		
		Trainer t = new Trainer("Dharm",27,"Java", 10000);
		t.display();
	}

}
