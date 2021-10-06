package sorting.quicksort;

public class QuickSort {
	
	public int[] quickSort(int[] arr, int start, int end) {
		
		if(start < end) {
			int pivotIndex = 0;
			pivotIndex = partition(arr, start, end);
			quickSort(arr, start, pivotIndex-1);
			quickSort(arr, pivotIndex+1, end);
		}
		
		return arr;
	}
	
	private int partition(int[] arr, int start, int end) {
		int pivotIndex = start;
		int pivot = arr[end];
		
		for(int i = start; i < end; i++) {
			if(arr[i] < pivot) {
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
