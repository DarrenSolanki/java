package objectClass;



public class B {

	//toString compares String values.
	//equals compares address to objects
	public String toString() {
//		return super.toString();
		return "Java";
	}
	public static void main(String[] args) {

		Object b = new B();
		B c= (B)b;
		System.out.println(b.toString());
		System.out.println(b);
		System.out.println(c.toString());
	}

}
//
//Test1 t1 = new Test(); // upcasting
//Test d = (Test)t1; //downcast

//Object obj = new MountainBike();
//MountainBike myBike = (MountainBike)obj;