package evaluation1;

import java.util.Arrays;

public class Question5 {
	public static void main(String[] args) {
		int n = 7;
		int res[][] = new int[n][n];
		int place = 0;

		int top = 0;
		int right = n;

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				place = 1;
			} else {
				place = 2;
			}

			for (int j = top; j < right; j++) {
				res[top][j] = place;
			}

			for (int j = top; j < right; j++) {
				res[j][right - 1] = place;
			}

			for (int j = right - 1; j >= 0; j--) {
				res[right - 1][j] = place;
			}

			for (int j = right - 1; j >= 0; j--) {
				res[j][top] = place;
			}
			top++;
			right--;
		}

		for (int[] is : res) {
			System.out.println(Arrays.toString(is));
		}
	}
}
