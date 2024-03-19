package javaassignment6;

import java.util.Scanner;

public class Question4 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the Email : ");
		String email = sc.next();
		if (email.indexOf("@") != -1) {
			if (email.indexOf("@") > 3 && email.indexOf("@") + 4 <= email.indexOf(".co")
					|| email.indexOf("@") + 4 <= email.indexOf(".in"))
				System.out.println("Email is Valid..!");
			else
				System.out.println("Email is Not Valid..!");
		} else {
			System.out.println("Email is Not Valid..!");
		}
	}
}
