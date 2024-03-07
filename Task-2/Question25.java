package task2;

import java.util.Scanner;

public class Question25 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the input:");
		String str = sc.next();
		for (int i = 1; i <= str.length(); i++) {
			for (int j = 1; j <= str.length(); j++) {
				if (i == j) {
					char res = str.charAt(i - 1);
					System.out.print(res + " ");
				} else if (i + j == str.length() + 1) {
					char res1 = str.charAt(j - 1);
					System.out.print(res1 + " ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
