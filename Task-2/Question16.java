package task2;

import java.util.Arrays;

public class Question16 {
	public static void main(String[] args) {
		int arr1[] = { 2, 4, 5, 6, 7, 9, 10, 13 };
		int arr2[] = { 2, 3, 4, 5, 6, 7, 8, 9, 11, 15 };
		int mergedarr[] = new int[arr1.length + arr2.length];

		int i = 0;
		int j = 0;
		while (i < arr1.length) {
			mergedarr[j++] = arr1[i++];
		}

		i = 0;
		while (i < arr2.length) {
			mergedarr[j++] = arr2[i++];
		}

		Arrays.sort(mergedarr);

		String res = "";

		for (int k = 0; k < mergedarr.length; k++) {
			res += " " + mergedarr[k];
			for (int s = k + 1; s < mergedarr.length; s++) {
				if (mergedarr[k] == mergedarr[s]) {
					k++;
				} else {
					break;
				}
			}
		}
		System.out.println(res);
	}
}
