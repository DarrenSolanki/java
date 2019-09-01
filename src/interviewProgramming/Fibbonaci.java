package interviewProgramming;

public class Fibbonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		int c;
		
		for(int i =0; i<5; i++) {
			c =a+b;
			a = b;
			b = c;
			System.out.println(c);

		}
	}

}
