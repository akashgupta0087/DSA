package array.rotation;

public class NoOfTimesSortedArrayRotated {
	public static void main(String[] args) {
		int[] arr = new int[] {7, 9, 11, 12, 5}; // = 4
//		7, 9, 11, 12, 15 = 0
//		4, 5, 1, 2, 3 = 2
		int noOfTimesArrayRotated = findNoOfTimesArrayRotated(arr);
		
		System.out.println("Number of Array Rotated is : " + noOfTimesArrayRotated);
	}
	
	private static int findNoOfTimesArrayRotated(int[] arr) {
		int noOfTimesArrayRotated = 0;
		int min = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
				noOfTimesArrayRotated = i;
			}
		}
		
		return noOfTimesArrayRotated;
	}
}
