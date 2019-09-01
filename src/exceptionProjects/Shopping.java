package exceptionProjects;


public class Shopping {
	
	//throws keyword is used to thow multiple exceptions.
	static void order() throws NullPointerException, FlipCartAmountException{
		int price =500;
		if(price >= 1000) {
			System.out.println("Successful shopping");
		}
		else {
			throw new FlipCartAmountException("Please shop for 1000 Rupees");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main starts");
		
		try {
			Shopping.order();
		} 
		catch (FlipCartAmountException e) {
			System.out.println(e.getmsg());
		
		}
		System.out.println("main ends");
	}
}


class FlipCartAmountException extends Exception{
	
	String msg;
	
	//constructor
	FlipCartAmountException(String msg){
		this.msg = msg;
	}
	
	//method
	String getmsg() {
		return msg;
	}
}









