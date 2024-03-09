package javaassignment4;

import java.util.Scanner;

public class Question3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the Size of Array : ");
		byte size = sc.nextByte();

		int arr[] = new int[size];

		byte i = 0;

		while (i < size)
			arr[i++] = sc.nextInt();

		System.out.println("Sum of Even Numbers : " + sumOfEven(arr));

	}

	public static int sumOfEven(int arr[]) {

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				sum += arr[i];
			else
				continue;
		}
		return sum;
	}
}
