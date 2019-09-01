package polymorphism;

class Shape{
	void draw() {
		System.out.println("No shape..!!");
	}
}

class Rectangle extends Shape{
	void draw() {
		System.out.println("Draw Retangle..!!");
	}
}

class Circle extends Shape{
	void draw() {
		System.out.println("Draw Circle..!!");
	}
}

public class Sample3 {
	
	static void data(Shape s) {
		s.draw();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample3.data(new Rectangle());
		Sample3.data(new Circle());
		Sample3.data(new Shape());


	}

}
