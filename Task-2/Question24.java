package task2;

import java.util.Scanner;

public class Question24 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; sum < n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				sum = sum + 1;
				System.out.print(sum + " ");
			}
			System.out.println(" ");
		}
	}
}
