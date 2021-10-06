package array.rotation;

import java.util.Arrays;
import java.util.List;

public class OptimalArrayRotation {
	public static void main(String[] args) {
//		int[] arr = new int[] {1, 2, 3, 4, 5};
		List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
		int d = 2;
		List<Integer> rotatedArr = rotateLeft(d, arr);
		for (int i = 0; i < rotatedArr.size(); i++) {
			System.out.print(rotatedArr.get(i) + " ");
		}
	}

	public static List<Integer> rotateLeft(int d, List<Integer> arr) {
		rotateList(0, d - 1, arr);
		rotateList(d, arr.size() - 1, arr);
		rotateList(0, arr.size() - 1, arr);
		return arr;

	}

	private static void rotateList(int start, int end, List<Integer> arr) {
		while (start < end) {
			int temp = arr.get(start);
			arr.set(start, arr.get(end));
			arr.set(end, temp);
			start++;
			end--;
		}
	}

}
