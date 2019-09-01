package encapsulation;

class Car{
	
	private String carName;
	private String carColor;
	
	Car(String carName, String carColor){
		this.carColor=carColor;
		this.carName = carName;
	}
	
	String getCarName() {
		return carName;
	}
	
	String getCarColor() {
		return carColor;
	}
	
	void setCarDetails(String carName, String carColor) {
		this.carName = carName;
		this.carColor = carColor;

		
	}
}
public class Sample1 {

	public static void main(String[] args) {
		Car c = new Car("Jaguar", "Red");
		System.out.println("Car name: "+c.getCarName()+"\n"+"Car color : "+c.getCarColor());
		c.setCarDetails("Nano", "Yellow");
		System.out.println("Car name: "+c.getCarName()+"\n"+"Car color : "+c.getCarColor());

		
	}

}
