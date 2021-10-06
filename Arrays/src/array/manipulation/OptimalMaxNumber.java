package array.manipulation;

import java.util.Arrays;
import java.util.List;

public class OptimalMaxNumber {
	
	public static void main(String[] args) {
		List<List<Integer>> queries = Arrays.asList(
				Arrays.asList(1, 2, 100),
				Arrays.asList(2, 5, 100),
				Arrays.asList(3, 4, 100));
		
		List<List<Integer>> queries1 = Arrays.asList(
				Arrays.asList(1, 5, 3),
				Arrays.asList(4, 8, 7),
				Arrays.asList(6, 9, 1));
		
		int n = 5;
		int n1 = 10;
		long maxNumber = getMaxNumber(n, queries);
		System.out.println("\n MaxNumber is : " + maxNumber);
	}
	
	private static long getMaxNumber(int n, List<List<Integer>> queries) {
		long max = 0l;
		long currentMax = 0l;
		long[] resultArray = new long[n + 1];
		
		for(int i = 0; i < queries.size(); i++) {
			resultArray[queries.get(i).get(0) - 1] = resultArray[queries.get(i).get(0) - 1] + queries.get(i).get(2);
			resultArray[queries.get(i).get(1)] = resultArray[queries.get(i).get(1)] - queries.get(i).get(2);
		}
		/** 
		 * To handle the case, where the array contains all the negative values.
		 * So the value at 0th position will always be larger from the rest of the combined values of the array.
		 */
		max = resultArray[0]; 
		for(int i = 1; i < resultArray.length; i++) {
			resultArray[i] = resultArray[i] + resultArray[i - 1];
			currentMax = resultArray[i];
			if(max < currentMax) {
				max = currentMax;
			}
			
		}
		printArray(resultArray);
		return max;
	}

	private static void printArray(long[] resultArray) {
		for(int i = 0; i < resultArray.length; i++) {
			System.out.print(resultArray[i] + " ");
		}
	}
}
