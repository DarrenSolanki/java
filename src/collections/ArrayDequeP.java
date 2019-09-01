package collections;

import java.util.ArrayDeque;

public class ArrayDequeP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> s = new ArrayDeque<String>();
		
		s.add("test");
		s.add("test");
		s.push("A");
		s.push("C");
		s.push("T");s.push("L");
		s.push("W");
		s.push("B");
		System.out.println(s);
		
		while(s.peek() != null) {
			System.out.println(s.pop()+ " ");
		}
		
		System.out.println(s.peek());
		System.out.println(s.pop());


	}

}
