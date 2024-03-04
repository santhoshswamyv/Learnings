package task2;

import java.util.Scanner;

public class Question11 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		StringBuilder result = new StringBuilder();
		String str = sc.next();
		int i = 0;
		while (i < str.length()) {
			char letter = str.charAt(i);
			i++;
			int count = 0;
			while (i < str.length() && Character.isDigit(str.charAt(i))) {
				count = count * 10 + Character.getNumericValue(str.charAt(i));
				i++;
			}

			for (int j = 0; j < count; j++) {
				result.append(letter);
			}
		}
		System.out.println(result.toString());
	}
}
