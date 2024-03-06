package task2;

import java.util.Arrays;

public class Question17 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		Arrays.sort(arr);
		int res[] = new int[arr.length];
		int i = 0, j = res.length - 1, k = 0;
		for (; i < res.length / 2; i++, j--) {
			res[k++] = arr[j];
			res[k++] = arr[i];
		}

		if (arr.length % 2 != 0) {
			res[k] = arr[j];
		}
		System.out.println(Arrays.toString(res));
	}
}
