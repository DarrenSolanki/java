package arrays;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[3];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		int a1[] = {30, 60, 90,180,500,750,100};
		
		System.out.println("Length of array is "+a.length);
		for(int i =0; i<a.length;i++) {
		System.out.println(a[i]);	
		}
		
		System.out.println();
		System.out.println("Length of array is "+a1.length);
		for(int i =0; i<a1.length;i++) {
		System.out.println(a1[i]);	
		}
	}

}
