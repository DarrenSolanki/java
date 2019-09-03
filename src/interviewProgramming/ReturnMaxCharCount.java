package interviewProgramming;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ReturnMaxCharCount {

	public static void main(String[] args) {
		
		String s ="qwqweqrerwqwwwwwwwer";
		char[] c = s.toCharArray();
		int size = c.length;
		 
		Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();
		
		int i =0;
		while(i != size) {
			if(m.containsKey(c[i]) == false) {
				m.put(c[i], 1);
			}
			else {
				int oldVal = m.get(c[i]);
				int newVal = oldVal+1;
				m.put(c[i], newVal);
			}
			++i;
		}
		
		Set<Map.Entry<Character, Integer>> hm = m.entrySet();
		char maxKey = ' ';
		int maxVal =0 ;
		
		for(Map.Entry<Character, Integer> data: hm) {
			
			if(data.getValue() > maxVal) {
				maxVal = data.getValue();
				maxKey = data.getKey();
			}
			
		}
		System.out.println(maxKey);
		System.out.println(maxVal);		
		
	}

}
