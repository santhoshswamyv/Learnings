package march05;

import java.util.Scanner;

public class Question4 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the Word : ");
		String s = sc.next();

		System.out.print("Enter the Rows : ");
		int r = sc.nextInt();

		int c = s.length();

		char arr[][] = new char[r][c];
		int i = 0;
		int row = 0;
		int column = 0;
		while (i < c) {

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

			row += 2;
			column -= 1;
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
