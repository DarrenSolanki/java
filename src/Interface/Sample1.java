package Interface;

interface Bank{
	double roi();  // by default public and static
}

class RBI{
	public double roi() {
	return 7.0;
	}
}

class ICICI{
	public double roi() {
		return 8.5;
		}
}

class AXIS{
	public double roi() {
		return 9.0;
		}
}
public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ICICI i = new ICICI();
		System.out.println("ICICI provides "+i.roi()+" rate of interest");
		
		RBI r = new RBI();
		System.out.println("RBI provides "+r.roi()+" rate of interest");
		
		AXIS a = new AXIS();
		System.out.println("AXIS provides "+a.roi()+" rate of interest");

	}

}
