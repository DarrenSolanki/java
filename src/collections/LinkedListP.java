package collections;

import java.util.LinkedList;

public class LinkedListP {

	public static void main(String[] args) {

		//List allows duplicates
		// ll implements- list, queue, dqueue
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("mango");
		ll.add("apple");
		ll.add("guava");
		ll.add("banana");
		ll.add("pineapple");
		ll.add("dates");
		ll.add("grapes");
		ll.add("orange");
		ll.add("king");
		ll.add("king");
		
		
//		System.out.println(ll);
//		ll.add(3, "wraught banana");
//		System.out.println(ll);
//		ll.addFirst("green mango");
//		System.out.println(ll);
//		ll.offerFirst("first mango");
//		System.out.println(ll);
//		ll.removeFirst();
//		System.out.println(ll);
//		ll.pollLast();
//		System.out.println(ll);
//		System.out.println(ll.get(3));
//		System.out.println(ll.set(2, "potato"));
//		System.out.println(ll);
//		ll.remove(5);
//		System.out.println(ll);
		
		String s[] = new String[ll.size()];
		s= ll.toArray(s);
		for(String z: s) {
		System.out.println(z);
		}

	}

}
