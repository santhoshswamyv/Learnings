package task2;

import java.util.Scanner;

public class Question1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		char ch = sc.next().charAt(0);
		for (int i = (int) ch; i <= 90; i++) {
			System.out.print((char) i);
		}
	}
}
