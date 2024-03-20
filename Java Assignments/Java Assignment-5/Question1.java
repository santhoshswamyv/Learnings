package javaassignment5;

import java.util.Arrays;
import java.util.Scanner;

public class Question1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Before Rotation : " + Arrays.toString(arr));

		System.out.print("Enter the number of positions to rotate : ");
		int d = sc.nextInt();

		d %= n;

		for (int i = 0; i < d; i++) {
			int temp = arr[n - 1];
			for (int j = n - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = temp;
		}

		System.out.println("Rotated array : " + Arrays.toString(arr));
	}
}
