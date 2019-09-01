package exceptionProjects;

public class AmazonShopping {

	static int age = 16;
	
	static void marriage() throws NotEligible {
		
			if(age>17) {
				System.out.println("eligible");
		}
			else{
				throw new NotEligible("Age should be 18yrs");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			AmazonShopping.marriage();
		} 
		catch (NotEligible e) {
			System.out.println(e.getmsg());
		
		}
		
	}

}

class NotEligible  extends Exception {
	
String msg;
	
	//constructor
	NotEligible(String msg){
		this.msg = msg;
	}
	
	//method
	String getmsg() {
		return msg;
	}
}
