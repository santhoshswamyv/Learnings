package javaassignment3;

import java.util.Scanner;

public class Question1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter Number a : ");
		int a = sc.nextInt();

		System.out.println();

		System.out.print("Enter Number b : ");
		int b = sc.nextInt();

		System.out.println();

		System.out.print("Enter Number c : ");
		int c = sc.nextInt();

		System.out.println();

		System.out.println("Greatest of 3 Numbers is : " + greatestOf3Numbers(a, b, c));

	}

	public static int greatestOf3Numbers(int a, int b, int c) {
		return (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
	}
}
