package programming;

import java.util.Scanner;

public class BillingApp {

	static int idly_price = 100;
	static int vada_price = 200;
	public static void main(String[] args) {

		System.out.println("Welcoe to hotel ");
		System.out.println("1. Idly");
		System.out.println("2. Idly");
		System.out.println("3. Idly and Vada");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select an Option");
		int option = sc.nextInt();
		
		switch (option) {
		case 1: System.out.println("Enter Idly qunatity");
		int i_qt = sc.nextInt();
		order(i_qt);		
		break;
		
		case 2: System.out.println("Enter vada qunatity");
		double v_qt = sc.nextInt();
		order(v_qt);		
		break;
		
		case 3: System.out.println("Enter Idly qunatity");
		int i_qty = sc.nextInt();
		int v_qty = sc.nextInt();

		order(i_qty, v_qty);		
		break;
		

		default:System.out.println("Enter valid option");
			break;
		}
		
	}
	
	static void order(int i_qt) {
		double amount = idly_price*i_qt;
		System.out.println("Total amount is : "+amount);
	}
	
	static void order(double v_qt) {
		double amount = vada_price*v_qt;
		System.out.println("Total amount is : "+amount);
	}
	
	static void order(int i_qty,  double v_qty) {
		double amount = ((idly_price*i_qty)+(vada_price*v_qty));
		System.out.println("Total amount is : "+amount);
	}

}
