package sorting.mergesort;

public class MergeSort {
	
	public void sort(int start, int end, int[] arr) {
		if(start < end) {
			int mid = (start + end) / 2;
//			resultArr = splitArr(start, mid, arr);
			sort(start, mid, arr);
			
//			int[] rightArr = splitArr(mid+1, end, arr);
			sort(mid+1, end, arr);
			merge(arr, start, mid, end);
		}
	}
	
	private int[] merge(int[] arr, int start, int mid, int end) {
//		int n = leftArr.length + rightArr.length;
		int[] resultArr = new int[5];
		return resultArr;
	}
	
	private int[] splitArr(int start, int end, int[] arr) {
		int n = (end-start) + 1;
		int[] newArr = new int[n];
		for(int i = 0; i < n; i++) {
			newArr[i] = arr[i];
		}
		return newArr;
		
	}
	
}
