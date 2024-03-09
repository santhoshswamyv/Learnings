package javaassignment3;

import java.util.Scanner;

public class Question3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the Student's Mark(0-100) : ");
		byte marks = sc.nextByte();

		System.out.println();

		System.out.println(calculateGrade(marks));
	}

	public static char calculateGrade(int marks) {
		if (marks > 90 && marks <= 100)
			return 'O';
		else if (marks > 80 && marks <= 90)
			return 'A';
		else if (marks > 70 && marks <= 80)
			return 'B';
		else if (marks > 60 && marks <= 70)
			return 'C';
		else if (marks > 50 && marks <= 60)
			return 'D';
		else if (marks >= 40 && marks <= 50)
			return 'E';
		else if (marks > 0 && marks < 40)
			return 'F';
		else {
			System.out.println("Marks should be positive and less than or Equal to 100");
			return ' ';
		}
	}
}
