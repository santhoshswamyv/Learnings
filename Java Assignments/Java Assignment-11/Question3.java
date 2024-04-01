package javaassignment11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			System.out.print("Enter your Phone Number : ");
			long phoneNumber = sc.nextLong();
			System.out.println("Your Phone Number is : " + phoneNumber);
		} catch (InputMismatchException e) {
			System.out.println("Only Numbers Accepted..!");
		}
	}
}
