package javaassignment2;

import java.util.Scanner;

public class Question3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the Input 1 : ");
		int a = sc.nextInt();

		System.out.println();

		System.out.print("Enter the Input 2 : ");
		int b = sc.nextInt();

		System.out.println();

		System.out.println("Bitwise XOR : " + bitwiseXor(a, b) + "\n");
		System.out.println("Bitwise AND : " + bitwiseAnd(a, b) + "\n");
		System.out.println("Bitwise OR : " + bitwiseOr(a, b) + "\n");
		System.out.println("Bitwise RightShift for Input 1 : " + bitwiseRightShift(a) + "\n");
		System.out.println("Bitwise LeftShift for Input 1 : " + bitwiseLeftShift(a) + "\n");
		System.out.println("Bitwise RightShift for Input 2 : " + bitwiseRightShift(b) + "\n");
		System.out.println("Bitwise LeftShift for Input 2 : " + bitwiseLeftShift(b) + "\n");

	}

	public static int bitwiseXor(int a, int b) {
		return (a ^ b);
	}

	public static int bitwiseAnd(int a, int b) {
		return (a & b);
	}

	public static int bitwiseOr(int a, int b) {
		return (a | b);
	}

	public static int bitwiseRightShift(int a) {
		return a >> 2;
	}

	public static int bitwiseLeftShift(int a) {
		return a << 2;
	}

}
