package practice;

import java.util.LinkedList;
import java.util.List;


abstract class M{
	final int x = 100;
	abstract void m1();
}

class N extends M{
	int x=10;
	public void m1() {
	
	}
}

public class HomePage {

	public static void main(String[] args) {
		
		List<Integer> l = new LinkedList<Integer>();
		l.add(12);
		l.add(14);l.add(12);
		l.add(76);
		l.add(65);
		l.add(893);
		l.add(324);
		l.add(222);
		N n = new N();
		System.out.println(n.x);
		int a[] = new int[l.size()];
		
	}

}
