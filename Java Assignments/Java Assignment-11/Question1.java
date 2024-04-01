package javaassignment11;

import java.util.Scanner;

public class Question1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the Numerator : ");
		int numerator = sc.nextInt();
		System.out.print("Enter the Denominator : ");
		int denominator = sc.nextInt();

		try {
			System.out.println("Result : " + numerator / denominator);
		} catch (ArithmeticException e) {
			System.out.println("Your trying divide by Zero..!");
		}

	}
}
