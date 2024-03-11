package march05;

import java.util.Scanner;

public class Question3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the Number : ");
		int input = sc.nextInt();
		int n = input;
		boolean b = false;
		while (input > 0) {
			int temp = input % 10;
			input = input / 10;
			int last = input % 10;
			if (temp > last) {
				continue;
			} else {
				b = true;
			}
		}

		if (b) {
			System.out.println(n + " is a Jumbled Number");
		} else {
			System.out.println(n + " is not a Jumbled Number");
		}
	}
}