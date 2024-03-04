package task2;

import java.util.Scanner;

public class Question12 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		char ch = sc.next().charAt(0);
		System.out.println(Character.isAlphabetic(ch));
	}
}
