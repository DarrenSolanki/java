package encapsulation;

class Account{
	
	private int balance = 1000;
	
	int getBalance(){
		return balance;
	}
	
	void setBalance(int damount) {
		if(damount > 0) {
			balance += damount;
			System.out.println("Deposited amount is : "+damount);
		}
		else {
			System.out.println("Invalid amount");
		}
		
	}
}
public class Bank {

	public static void main(String[] args) {
		
		Account a = new Account();
		System.out.println("Balance is : "+a.getBalance());
		a.setBalance(30000);
		System.out.println("Balance is : "+ a.getBalance());
	}

}
