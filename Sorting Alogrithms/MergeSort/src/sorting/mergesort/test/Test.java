package sorting.mergesort.test;

import sorting.mergesort.MergeSort;

public class Test {
	public static void main(String[] args) {
		int[] arr = new int[] {4, 8, 7, 2, 3, 5, 1, 9};
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(0, arr.length-1, arr);
//		System.out.println(resultArr.length);
//		for(int i = 0; i < resultArr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		
	}
}
