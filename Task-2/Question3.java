package task2;

import java.util.Scanner;

public class Question3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int students = sc.nextInt();

		int startRollNo = 100;

		int endRollNo = 100 + students;

		System.out.print("Enter the number of groups : ");
		int totalGroups = sc.nextInt();

		for (int i = 0; i < totalGroups; i++) {
			System.out.println("Group " + (i + 1) + ":");
			for (int rollNo = startRollNo + i; rollNo <= endRollNo; rollNo += totalGroups) {
				System.out.println(rollNo);
			}
			System.out.println();
		}

	}
}
