package programming;

import java.util.ArrayList;
import java.util.Arrays;

public class DailyPractice {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("Initial size of list is : "+al.size());

		al.add(12);
		al.add(24);
		al.add(54);
		al.add(32);
		al.add(74);
		al.add(92);
		al.add(10);
		al.add(44);
		al.add(44);al.add(44);al.add(98);al.add(99);al.add(95);
		
		System.out.println("Size after adding elements in list is:"+al.size());
		al.remove(0);
		System.out.println(al.remove(11));

		System.out.println("Size after removing elements in list is:"+al.size());
		System.out.println(al);
		System.out.println(al.contains(109));
		
		
		//Get the array	
		Integer a[] = new Integer[al.size()];
		a = al.toArray(a);
		System.out.println(a);
		
		int[] a1 = new int[al.size()];
		System.out.println(a1);
		int sum = 0;
		
		//sum the array
		for(int i : a){
			sum += i;
		}
		System.out.println("Sum of array is : "+sum);

		
	}
	
	

}
