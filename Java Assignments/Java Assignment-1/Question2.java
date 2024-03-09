package javaassignment1;

import java.util.Scanner;

public class Question2 {
	static Scanner sc = new Scanner(System.in);

	enum Weekday {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}

	public static void main(String[] args) {
		System.out.print("Enter a number : ");
		int dayNumber = sc.nextInt();

		System.out.println();

		if (dayNumber >= 1 && dayNumber <= 7) {
			System.out.println("The weekday is: " + getWeekday(dayNumber));
		} else {
			System.out.println("Invalid input. Please enter a number between 1 and 7.");
		}
	}

	public static Weekday getWeekday(int dayNumber) {
		return Weekday.values()[dayNumber - 1];
	}
}
