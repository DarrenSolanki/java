package programming;

public class ReverseAInteger {

	public static void main(String[] args) {

		int num = 123;
		int rev=0;
		
		while(num>0) {
			int rem = num %10;//3 , 2, 1
			
			rev = (rev*10)+rem; //2,32, 321
			num = num/10;
		
		}
		
		System.out.println(rev);
	}

}
