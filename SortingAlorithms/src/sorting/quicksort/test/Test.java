package sorting.quicksort.test;

import sorting.quicksort.QuickSort;
import sorting.quicksort.randomized.QuickSortRandomized;

public class Test {
	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		int[] arr = new int[] {25,80,19,27,63,84,15,20,95,1};
		int[] arrSorted = qs.quickSort(arr, 0, arr.length-1);
		
		for(int i = 0; i < arrSorted.length; i++) {
			System.out.print(arrSorted[i] + " ");
		}
		
		System.out.println(" ");
		
		QuickSortRandomized randomQS = new QuickSortRandomized();
		int[] arrRandom = new int[] {25,80,19,27,63,84,15,20,95,1};
		int[] arrSortedRandom = randomQS.quickSort(arrRandom, 0, arr.length-1);
		
		for(int i = 0; i < arrSortedRandom.length; i++) {
			System.out.print(arrSortedRandom[i] + " ");
		}
	}
}
