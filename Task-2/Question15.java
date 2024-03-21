package task2;

import java.util.Arrays;

public class Question15 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 4, 5, 4, 4, 5, 5, 6, 7, 8, 9, 9 };

		Arrays.sort(arr);
		int prevDuplicate = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1] && arr[i] != prevDuplicate) {
				System.out.println(arr[i]);
				prevDuplicate = arr[i];
			}
		}
	}

}
