package javaassignment4;

import java.util.Scanner;

public class Question2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = sc.nextInt();

		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		int count = 1;
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		return count == 2 ? true : false;
	}
}