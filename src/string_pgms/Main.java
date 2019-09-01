package string_pgms;

public class Main {

	public static void main(String[] args) {

		String s1 = "I love programming";
		String s2 = "google";
		String s3 = " Google ";
		String s4 =" ";
		
		System.out.println(s1.length());
		System.out.println("Compare using equals()"+s2.equals(s3));
		System.out.println("Compare using ignore case "+s2.equalsIgnoreCase(s3));
		System.out.println("Character at 3rd index : "+s2.charAt(3));
		System.out.println("Convert to upper case "+s1.toUpperCase());
		System.out.println("convert to lower case "+s1.toLowerCase());
		System.out.println("substring "+s2.substring(5));
		System.out.println(" : "+s1.substring(7,18));
		System.out.println(s2.replace('g','d'));
		System.out.println("replaceAll : "+s1.replaceAll("love", "hate"));
		System.out.println("isEmpty: "+s4.isEmpty());
		System.out.println("isBlank : "+s4.isBlank());
		System.out.println("Trim :"+s3.trim());
		System.out.println("Trim :"+s1.trim());

		
		/*
		 * String s1 = "I LOVE CORE JAVA"; String s2 = " welcome "; String s3 =
		 * " google ";
		 * 
		 * System.out.println("The length of string is "+s1.length());
		 * System.out.println(s1.toLowerCase()); System.out.println(s1.toUpperCase());
		 * System.out.println(s1.charAt(5)); System.out.println(s1.substring(5));
		 * System.out.println(s1.substring(2, 6)); System.out.println(s1.contains("I"));
		 * System.out.println(s1.isEmpty());
		 * 
		 * System.out.println("Trim method : "+ s2.trim()); System.out.println();
		 * System.out.println("Before replacxement : "+ s3); String s4 = s3.replace('g',
		 * 'd'); System.out.println("After replacement : "+ s4);
		 * System.out.println(s1.replaceAll("LOVE", "HATE"));
		 * 
		 * System.out.println(s1.replaceAll(" ", "\n"));
		 */
	}

}
