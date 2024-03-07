package task2;

public class Question30 {
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int len = arr.length, i = 0, row, col;
		for (i = 0; i < 2 * len - 1; i++) {
			row = (i < len) ? 0 : i - len + 1;
			col = (i < len) ? i : len - 1;
			while (row < len && col >= 0) {
				System.out.print(arr[row][col] + " ");
				row++;
				col--;
			}
			System.out.println();
		}
	}
}