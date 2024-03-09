package javaassignment3;

import java.util.Scanner;

public class Question4 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the Number of the Table : ");
		int table = sc.nextInt();

		System.out.println();

		tables(table);
	}

	public static void tables(int n) {
		for (int i = 1; i <= 20; i++) {
			System.out.println(n + " X " + i + " = " + n * i);
		}
	}
}