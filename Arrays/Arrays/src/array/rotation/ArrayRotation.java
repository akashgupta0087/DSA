package array.rotation;

public class ArrayRotation {
	
	public static void main(String[] args) {
//		int size = 0;
		int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		arr = rotateArray(arr, 5);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public static int[] rotateArray(int[] arr, int rotateTimes) {
		int temp = 0;
		while(rotateTimes > 0) {
			temp = arr[0];
			for(int i = 0; i < (arr.length - 1); i++) {
				arr[i] = arr[i + 1];
			}
			arr[arr.length - 1] = temp;
			rotateTimes--;
		}
		
		return arr;
	}

}
