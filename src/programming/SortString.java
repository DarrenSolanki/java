package programming;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {

		String s[] = {"Qspider","Jspader","Jspbder","Jspcder","qspider","jspider"};
		Arrays.sort(s);
		
		for(String s1:s) {
		System.out.println(s1);	
		}
		
//		int size = s.length;
//		for(int i =0;i<size-1;i++) {
//			for(int j =0;j<s.length;j++) {
//				
//				if(s[i].compareTo(s[j])>0){
//					String temp = s[i];
//					s[i] = s[j];
//					s[j] = temp;
//					
//				}
//			}
//		}
//		System.out.println(Arrays.toString(s));
	}

}
