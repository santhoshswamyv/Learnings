package march05;

import java.util.Scanner;

public class Question2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		int up = 0;
		int down = n;
		int left = 0;
		int start = 1;
		int arr[][] = new int[n][n];
		int row = 0;
		int column = 0;
		int s = 0;
		while (s < n) {
			while (row < down && column < down) {
				arr[row][column] = start++;
				row++;
				column++;
			}
			down--;
			row -= 2;
			column--;
			while (row >= up) {
				arr[row][column] = start++;
				row--;
			}
			up++;
			row++;
			column--;
			while (column > left) {
				arr[row][column] = start++;
				column--;
			}
			left += 2;
			row++;
			column += 2;
			System.out.println(row);
			System.out.println(column);
			s += 3;
		}
		for (int j = 0; j < arr.length; j++) {
			for (int j2 = 0; j2 < n; j2++) {
				if (arr[j][j2] != 0) {
					System.out.print(arr[j][j2] + " ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}
