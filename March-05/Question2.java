package march05;

import java.util.Scanner;

public class Question2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String s = "ZOHOISHIRING";
		int r = 4;
		int c = s.length();

		char arr[][] = new char[r][c];
		int i = 0;
		int row = -2;
		int column = 1;
		while (i < c) {
			row += 2;
			column -= 1;
			while (row < r && i < c) {
				arr[row][column] = s.charAt(i++);
				row++;
			}

			row -= 2;
			column++;
			while (row >= 0 && i < c) {
				arr[row][column] = s.charAt(i++);
				row--;
				column++;
			}
		}
		for (int j = 0; j < arr.length; j++) {
			for (int j2 = 0; j2 < arr[j].length; j2++) {
				if (arr[j][j2] != 0) {
					System.out.print(arr[j][j2]);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
