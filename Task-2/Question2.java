package task2;

import java.util.Scanner;

public class Question2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(bitwiseXor(a, b));
		System.out.println(bitwiseAnd(a, b));
		System.out.println(bitwiseOr(a, b));
		System.out.println(bitwiseComplement(a));
		System.out.println(bitwiseRightShift(a));
		System.out.println(bitwiseLeftShift(a));

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

	public static int bitwiseComplement(int a) {
		return ~a;
	}

	public static int bitwiseRightShift(int a) {
		return a >> 2;
	}

	public static int bitwiseLeftShift(int a) {
		return a << 2;
	}

}
