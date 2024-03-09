package javaassignment3;

import java.util.Scanner;

public class Question5 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the Number to Find Factorial : ");
		int n = sc.nextInt();

		System.out.println();

		System.out.println("Factorial of " + n + " is " + factorial(n));
	}

	public static int factorial(int n) {
		int result = 1;

		for (int i = 1; i <= n; i++)
			result *= i;

		return result;
	}
}
