package array.manipulation;

import java.util.Arrays;

public class ZombieAndCaves {
	public static void main(String[] args) {
		int n = 5;
		long[] caves = new long[]{1, 2, 3, 4, 5};
		long[] healths = new long[] {5, 4, 3, 4, 5};
		System.out.println(isPossibleToKillAll(caves, healths, n));
	}
	
	private static String isPossibleToKillAll(long[] caves, long[] healths, int n) {
		String isPossibleToKillAll = null;
		long[] resultArray = new long[n + 1];
		for(int i = 1; i < resultArray.length; i++) {
			resultArray[i-i] = resultArray[i-i] + 1;
			if((i + i) < resultArray.length) {
				resultArray[i + i] = resultArray[i + i] + 1;
			} else if((i + 1) < resultArray.length){
				resultArray[i + 1] = resultArray[i + 1] + 1;
			}
		}
		int killCounter = 0;
		for(int i = 1; i < resultArray.length; i++) {
			resultArray[i] = resultArray[0] - resultArray[i];
		}
		
		Arrays.sort(resultArray);
		Arrays.sort(healths);
		
		for(int i = 0; i < resultArray.length - 1; i++) {
			if(resultArray[i] == healths[i]) {
				killCounter++;
			}
		}
		
		if(killCounter == n)
			isPossibleToKillAll = "YES";
		else
			isPossibleToKillAll = "NO";
		
		printArray(resultArray);
		
		return isPossibleToKillAll;
	}
	
	private static void printArray(long[] resultArray) {
		for(int i = 1; i < resultArray.length; i++)
			System.out.print(resultArray[i] + " ");
	}
}
