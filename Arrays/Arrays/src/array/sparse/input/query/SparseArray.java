package array.sparse.input.query;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SparseArray {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("aba", "baba", "aba", "xzxb");
		List<String> queries = Arrays.asList("aba", "xzxb", "ab");
		
		List<Integer> arr = matchingStrings(strings, queries);
		for(Integer count : arr) {
			System.out.print(count + " ");
		}
	}
	
	 public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
		 List<Integer> arr = new ArrayList<Integer>(); 
		 for(int i = 0; i < queries.size(); i++) {
			 int count = 0;
			 for(int j = 0; j < strings.size(); j++) {
				if(queries.get(i) == strings.get(j)) {
					count++;
				}
			 }
			 
			 arr.add(count);
		 }
		 
		return arr;
	}
}
