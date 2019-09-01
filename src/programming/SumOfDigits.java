package programming;

public class SumOfDigits {

	public static void main(String[] args) {

		int num = 132131;
		int sum = 0;
		
		while(num!=0) {
			int rem = num%10; //storing remainder
			sum +=rem;
			num = num/10;
		}
		System.out.println(sum);
	}

}
