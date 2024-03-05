package task2;

import java.util.Scanner;

public class Question28 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int size = sc.nextInt();

		int i = 1;
		int result = 1;
		int k = 1;
		while (i < size) {
			k = k * 10 + 1;
			result += k;
			i++;
		}
		System.out.println(result);
	}
}
