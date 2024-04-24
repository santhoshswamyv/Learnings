package evaluation1;

import java.util.Scanner;

public class Question1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		char input = sc.next().charAt(0);

//		char input = 'F';

		int n = input - 'A' + 1;
		char a = 'A';

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print("  ");
			}

			if (i == 0) {
				System.out.print(a + " ");
			} else {
				System.out.print(a + " ");

				for (int k = 0; k < i * 2 - 1; k++) {
					System.out.print("  ");
				}

				System.out.print(a + " ");
			}
			a++;

			for (int j = 0; j < n - i - 1; j++) {
				System.out.print("  ");
			}

			System.out.println();
		}

		a--;

		for (int i = n - 2; i >= 0; i--) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print("  ");
			}

			a--;
			if (i == 0) {
				System.out.print(a + " ");
			} else {
				System.out.print(a + " ");

				for (int k = 0; k < i * 2 - 1; k++) {
					System.out.print("  ");
				}

				System.out.print(a + " ");
			}

			for (int j = 0; j < n - i - 1; j++) {
				System.out.print("  ");
			}

			System.out.println();
		}
	}
}