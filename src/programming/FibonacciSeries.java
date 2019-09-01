package programming;

public class FibonacciSeries {

	public static void main(String[] args) {

//		0, 1, 1, 2, 3, 5, 8,13

		int a = 0;
		int b = 1;
		int c;
		
		for(int i =0 ; i<5; i++) {
			c = a+b;
			a=b;
			b=c;
			
			
			System.out.println(c);
		}
				
	}

}
