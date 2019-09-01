package programming;

public class SortingIntegers {

	public static void main(String[] args) {
		
		int a [] = {10, 5 ,15, 20,20,15, 30};
		int largest = a[0];
		for (int i =0; i<a.length;i++) {
			
			if(a[i]>largest) {
				largest = a[i];
			}
		}
		System.out.println(largest);
	}

}
