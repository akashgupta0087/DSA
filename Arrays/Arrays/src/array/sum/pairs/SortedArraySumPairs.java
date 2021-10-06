package array.sum.pairs;

import java.util.HashMap;
import java.util.Map;

public class SortedArraySumPairs {
	
	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<>();
		
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		
		map1.put(i1, "One");
		map1.put(i2, "One");
		
		Object obj = null;
		String s1 = "Akash";
		String s2 = "Akash";
		
		System.out.println("s1 hashcode : " + s1.hashCode());
		System.out.println("s2 hashcode : " + s2.hashCode());
		
		System.identityHashCode(s1);
		
		System.out.println("Map Size : " + map1.size());
	}

}
