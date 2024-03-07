package task2;

import java.util.Arrays;

public class Question19 {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		arr = rotateLeft(arr);

		System.out.println("Array after left rotation:");
		printArray(arr);
	}

	public static int[][] rotateLeft(int[][] arr) {
		int size = arr.length;
		int[][] rotated = new int[size][size];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				rotated[i][j] = arr[j][size - 1 - i];
			}
		}

		return rotated;
	}

	public static void printArray(int[][] arr) {
		for (int[] row : arr) {
			System.out.println(Arrays.toString(row));
		}
	}
}
