package encapsulation;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Overloading a = new Overloading();
		 double area = a.area(10);
		 System.out.println("Area of circle: "+area);
	}

	double area(int length, int width){
		
		double area = length*width;
		return area;
	}
	
	double area(double radius){
		double area = 3.14 * radius* radius;
		return area;
	}
}
