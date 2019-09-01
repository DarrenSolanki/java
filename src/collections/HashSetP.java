package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetP {

	public static void main(String[] args) {
		
		//Hashset does not maintain insertion order
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Mango");
		hs.add("Carrot");
		System.out.println(hs.add("apple"));
		System.out.println(hs.add("apple"));
		System.out.println(hs.hashCode());
		
		System.out.println(hs);
		
		
	}

}
