package string_pgms;

public class Sample {

	public void string() {
		String a1 = new String("Hi");
		String a2  = new String("hi");
		
		System.out.println(a1.equals(a2));
		System.out.println(a1.equalsIgnoreCase(a2));
		
		System.out.println();
		
		String s1 = new String("Hi");
		String s2 = "Hi";
		
		System.out.println(s1.equals(s2)); //compares the value of string
		System.out.println(s1==s2); // compares the address of object

	}

}
