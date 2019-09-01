package polymorphism;

interface USB{
	void read();
	void write();
}

class Pendrive implements USB{
	public void read() {
		System.out.println("Reading from Pendrive");
	}
	
	public void write() {
		System.out.println("Writing into Pendrive");
	}
}

class Mobile implements USB{
	public void read() {
		System.out.println("Reading from Mobile");
	}
	
	public void write() {
		System.out.println("Writing into Mobile");
	}
}


public class Sample1 {
	
	static void data(USB u) {
		u.read();
		u.write();
	}

	public static void main(String[] args) {

//		Sample1 s = new Sample1();
//		s.data(new Mobile());
//		s.data(new Pendrive());
		
		Sample1.data(new Mobile());
		Sample1.data(new Pendrive());


	}

}
