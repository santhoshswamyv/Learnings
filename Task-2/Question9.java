package task2;

import java.util.Scanner;

public class Question9 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int temp = n;
		int res = 0;
		while (temp > 0) {
			int last = temp % 10;
			res = res * 10 + last;
			temp /= 10;
		}
		System.out.println(res);
	}
}
