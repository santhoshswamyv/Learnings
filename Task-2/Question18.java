package task2;

import java.util.Arrays;

public class Question18 {
	public static void main(String[] args) {
		int[] arr = { 13, 2, 4, 15, 12, 10, 5 };
		int[] odd = new int[arr.length / 2 + arr.length % 2];
		int[] even = new int[arr.length / 2];

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				odd[i / 2] = arr[i];
			} else {
				even[i / 2] = arr[i];
			}
		}

		Arrays.sort(odd);
		Arrays.sort(even);

		for (int i = odd.length - 1, j = 0; i >= 0; i--, j += 2) {
			arr[j] = odd[i];
		}

		for (int i = 0, j = 1; i < even.length; i++, j += 2) {
			arr[j] = even[i];
		}

		System.out.println(Arrays.toString(arr));
	}
}
