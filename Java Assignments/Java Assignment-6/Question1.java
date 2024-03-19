package javaassignment6;

import java.util.Scanner;

public class Question1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the String : ");
		String s = sc.next();
		String vowels = "aeiouAEIOU";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (vowels.indexOf(s.charAt(i)) != -1) {
				count++;
			}
		}
		System.out.println("There are " + count + " vowels in the String..!");
	}
}
