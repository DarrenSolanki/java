package collections;

import java.util.LinkedHashSet;

public class LinkedHashSetP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Linked Hashset maintains the insertion order
		
				LinkedHashSet<String> ls = new LinkedHashSet<String>();
				ls.add("A");
				ls.add("C");
				ls.add("D");
				ls.add("B");
				ls.add("E");
				ls.add("L");
				ls.add("K");
				ls.add("J");
				ls.add("M");
				System.out.println(ls);
	}

}
