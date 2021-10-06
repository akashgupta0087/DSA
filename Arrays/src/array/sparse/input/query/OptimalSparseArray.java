package array.sparse.input.query;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class OptimalSparseArray {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("aba", "baba", "aba", "xzxb");
		List<String> queries = Arrays.asList("aba", "xzxb", "ab");
		
		List<Integer> arr = matchingStrings(strings, queries);
		for(Integer count : arr) {
			System.out.print(count + " ");
		}
	}
	
	 public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
		 Map<String, Integer> stringMap = new HashMap<String, Integer>();
		 List<Integer> arr = new LinkedList<Integer>(); 
		 for(int i = 0; i < strings.size(); i++) {
			 if(stringMap.get(strings.get(i)) != null) {
				 stringMap.put(strings.get(i), stringMap.get(strings.get(i)) + 1);
			 } else {
				 stringMap.put(strings.get(i), 1);
			 }
		 }
		 
		 for(int i = 0; i < queries.size(); i++) {
			 arr.add(stringMap.get(queries.get(i)) != null ? stringMap.get(queries.get(i)) : 0);
		 }
		 
		return arr;
	}
}
