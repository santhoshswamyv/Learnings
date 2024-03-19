package javaassignment6;

import java.util.Scanner;

public class Question2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the String : ");
		String s = sc.next();
		String res = "";
		System.out.println("String before Reverse : " + s);

		for (int i = s.length() - 1; i >= 0; i--)
			res += s.charAt(i);

		System.out.println("String after Reverse : " + res);
	}
}
