package javaassignment1;

import java.util.Scanner;

public class Question5 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("Before Swapping a is " + a);
		System.out.println("Before Swapping b is " + b);

		System.out.println();
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println();

		System.out.println("After Swapping a is " + a);
		System.out.println("After Swapping b is " + b);
	}
}
