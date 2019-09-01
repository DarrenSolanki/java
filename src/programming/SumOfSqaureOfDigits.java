package programming;

public class SumOfSqaureOfDigits {

	public static void main(String[] args) {

		int num = 123;
		int sum = 0;
		while(num!=0) {
			int rem = num%10;
			int a1 = rem * rem;
			sum = sum+a1;
			num = num/10;
		}
		System.out.println(sum);
	}

}
