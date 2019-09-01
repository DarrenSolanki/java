package string_pgms;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountLettersInString {

	// Method that returns the count of the given 
    // character in the string 
    public static long count(String s) 
    { 
    	char[] c = s.toCharArray();
    	for(int i =0; i<s.length();i++) {
        // Use Matcher class of java.util.regex 
        // to match the character 
        Matcher matcher 
            = Pattern.compile(String.valueOf(c[i])) 
                  .matcher(s); 
  
        int res = 0; 
  
        // for every presence of character ch 
        // increment the counter res by 1 
        while (matcher.find()) { 
            res++; 
        } 
  
        return res; 
    	}
    	return 0;
    } 
  
    // Driver method 
    public static void main(String args[]) 
    { 
        String str = "geeksforgeeks"; 
        char c = 'e'; 
        System.out.println(count(str)); 
    } 


		
		/*
		 * String s = "AAABBBCCCCC"; int count=0; int count1=0; int count2=0;
		 * 
		 * 
		 * char[] c = s.toCharArray(); for(int i = 0; i<s.length();i++) {
		 * 
		 * if(s.charAt(i)=='A'){ count++; } else if(s.charAt(i)=='B') { count1++; } else
		 * if(s.charAt(i)=='C'){ count2++; }
		 * 
		 * } System.out.println("A is "+count); System.out.println("B is "+count1);
		 * System.out.println("C is "+count2); int[] a = {count,count1,count2};
		 * Arrays.sort(a); int l = a.length; System.out.println(a[l-1]);
		 */
		

	

}
