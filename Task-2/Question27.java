package task2;

import java.util.Scanner;

public class Question27 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.println(solution(s1, s2));

	}

	public static int solution(String s1, String s2) {
		for (int i = 0; i < s1.length() - s2.length(); i++) {
			if (s1.substring(i, i + s2.length()).equals(s2)) {
				return i;
			}
		}
		return -1;
	}
}
