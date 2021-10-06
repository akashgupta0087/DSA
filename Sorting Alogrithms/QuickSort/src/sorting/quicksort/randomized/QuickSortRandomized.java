package sorting.quicksort.randomized;

import java.util.Random;

public class QuickSortRandomized {

	public int[] quickSort(int[] arr, int start, int end) {

		if (start < end) {
			int pivotIndex = 0;
			pivotIndex = partition(arr, start, end);
			quickSort(arr, start, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, end);
		}

		return arr;
	}

	private int partition(int[] arr, int start, int end) {
		Random rand= new Random();
		int pivotIndex = start;
		
		int randomTemp = arr[rand.nextInt(end-start)+start];
		arr[rand.nextInt(end-start)+start] = arr[end];
		arr[end] = randomTemp;
		
		int pivot = arr[end];

		for (int i = start; i < end; i++) {
			if (arr[i] < pivot && pivotIndex < end) {
				int temp = 0;
				temp = arr[pivotIndex];
				arr[pivotIndex] = arr[i];
				arr[i] = temp;
				pivotIndex++;
			}
		}

		int pivotTemp = 0;
		pivotTemp = arr[end];
		arr[end] = arr[pivotIndex];
		arr[pivotIndex] = pivotTemp;

		return pivotIndex;

	}
}
