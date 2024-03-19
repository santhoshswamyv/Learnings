package javaassignment6;

import java.util.Scanner;

public class Question3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the Sentence : ");
		String s = sc.nextLine();

		String splitted[] = s.split(" ");

		String res = "";
		for (int i = 0; i < splitted.length; i++) {
			for (int j = splitted[i].length() - 1; j >= 0; j--) {
				res += splitted[i].charAt(j);
			}
			res += " ";
		}

		System.out.println(res);
	}
}
