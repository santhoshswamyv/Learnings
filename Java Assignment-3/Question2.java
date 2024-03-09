package javaassignment3;

import java.util.Scanner;

public class Question2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the Year : ");
		short year = sc.nextShort();

		System.out.println();

		System.out.print("Enter the Month : ");
		byte month = sc.nextByte();

		System.out.println();

		System.out.println(calculateDays(year, month) + " Days");

	}

	public static byte calculateDays(short year, byte month) {
		boolean isLeap = false;

		if (year % 4 == 0)
			isLeap = true;

		if (isLeap && month == 2) {
			return 29;
		} else {
			if (month != 2) {
				if (month % 2 == 0)
					return 30;
				else
					return 31;
			} else {
				return 28;
			}
		}

	}
}
