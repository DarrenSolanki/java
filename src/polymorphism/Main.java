package polymorphism;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	
	String s[] = {"Q","A","B", "D"};
	Arrays.parallelSort(s);
	for(String a :s) {
		System.out.println(a);
	}
	
	}
}

