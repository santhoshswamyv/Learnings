package task2;

import java.util.Scanner;

public class Question26 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int num = 5;
		for (int i = 1; i <= num; i++) {

			for (int j = i; j <= num; j++) {

				System.out.print("*");

			}
			for (int j = 2; j <= i; j++) {

				System.out.print("-");

			}
			for (int j = 2; j <= i; j++) {

				System.out.print("-");

			}

			for (int j = i; j <= num; j++) {

				System.out.print("*");

			}

			System.out.println();

		}

		for (int i = 2; i <= num; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print("*");

			}

			for (int j = i; j < num; j++) {

				System.out.print("-");

			}
			for (int j = i; j < num; j++) {

				System.out.print("-");

			}
			for (int j = 1; j <= i; j++) {

				System.out.print("*");

			}

			System.out.println();

		}
	}
}
