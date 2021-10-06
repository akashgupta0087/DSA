package array.manipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxNumber {
	public static void main(String[] args) {
//		List<List<Integer>> queries = Arrays.asList(
//				Arrays.asList(1, 2, 100),
//				Arrays.asList(2, 5, 100),
//				Arrays.asList(3, 4, 100));
		
		List<List<Integer>> queries = Arrays.asList(
				Arrays.asList(1, 5, 3),
				Arrays.asList(4, 8, 7),
				Arrays.asList(6, 9, 1));
		
		int n = 10;
		long maxNumber = getMaxNumber(n, queries);
		System.out.println("\n MaxNumber is : " + maxNumber);
	}
	
	private static long getMaxNumber(int n, List<List<Integer>> queries) {
		long max = 0l;
//		Arrays.fill(new Long[n], 0);
//		List<Long> resultList =  Arrays.asList(new Long[n]);
		long[] resultArray = new long[n];
		for(int i = 0; i < queries.size(); i++) {
			List<Integer> subQueries = queries.get(i);
			long currentMax = 0l;
			for(int j = subQueries.get(0); j <= subQueries.get(1); j++) {
					currentMax = resultArray[j - 1] + subQueries.get(2);
					resultArray[j - 1] = currentMax;
					if(max < currentMax) {
						max = currentMax;
				}
			}
		}
		
		for(int i = 0; i < resultArray.length; i++) {
			System.out.print(resultArray[i] + " ");
		}
		return max;
	}
}
