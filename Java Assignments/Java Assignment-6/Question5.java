package javaassignment6;

import java.util.Arrays;
import java.util.Scanner;

public class Question5 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the Sentence : ");
		String s = sc.nextLine();

		String splitted[] = s.split(" ");

		for (int i = 0; i < splitted.length; i++) {
			String temp = splitted[i].substring(1);
			char t = Character.toUpperCase(splitted[i].charAt(0));
			splitted[i] = t + temp;
		}
		
		System.out.println(Arrays.toString(splitted));
	}
}
