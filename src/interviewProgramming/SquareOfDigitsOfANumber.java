package interviewProgramming;

public class SquareOfDigitsOfANumber {

	public static void main(String[] args) {

		int num =123;
		int sum = 0;
		while(num != 0) {
			int rem = num/10;
			int square = rem*rem;
			sum = sum +square;
		}
		System.out.println(sum);
	}

}
