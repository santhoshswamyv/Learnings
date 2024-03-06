package task2;

import java.util.Arrays;

public class Question15 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 4, 4, 5, 5, 6, 7, 8, 9, 9 };

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);
					break;
				}
			}
		}
	}

}
