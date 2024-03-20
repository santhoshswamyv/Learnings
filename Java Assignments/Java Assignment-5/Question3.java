package javaassignment5;

import java.util.Arrays;

public class Question3 {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] b = { { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } };

		int rowsA = a.length;
		int colsA = a[0].length;
		int colsB = b[0].length;

		int[][] c = new int[rowsA][colsB];

		for (int i = 0; i < rowsA; i++) {
			for (int j = 0; j < colsB; j++) {
				for (int k = 0; k < colsA; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		System.out.println(Arrays.deepToString(c));
	}
}