package javaassignment4;

import java.util.Scanner;

public class Question1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the Size of Array : ");
		byte size = sc.nextByte();

		System.out.println();

		int arr[] = new int[size];

		byte i = 0;

		while (i < size)
			arr[i++] = sc.nextInt();

		System.out.println();

		System.out.print("Enter the Element to Search: ");

		int search = sc.nextInt();

		System.out.println();

		int index = 0;

		i = 0;

		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == search) {
				i++;
			}

			if (i == 2) {
				index = j;
				break;
			} else
				index = -1;
		}

		System.out.println("Index of Second Number of Input is " + index);

	}

}