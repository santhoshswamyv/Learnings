package evaluation1;

import java.util.Scanner;

public class Question4 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int size = sc.nextInt();
		int arr[] = new int[size];
		int t = 0;
		while (t < size) {
			arr[t++] = sc.nextInt();
		}

//		int arr[] = { 2, 7, 5, -1, -3, 2, 9, 7 };

		int i = 0;
		int startIndex = 0;
		int endIndex = 0;
		int maxSum = -1;

		int temp = 0;

		int currentSum = 0;
		while (i < arr.length) {
			if (arr[i] > 0 || i + 1 > arr.length) {
				if (currentSum == 0) {
					temp = i;
				}
				currentSum += arr[i];
				if (currentSum > maxSum) {
					maxSum = currentSum;
					startIndex = temp;
					endIndex = i;
				}
			} else {
				currentSum = 0;
			}
			i++;
		}

		System.out.println("Sum :" + maxSum);
		System.out.print("Elements : ");

		for (int j = startIndex; j <= endIndex; j++) {
			System.out.print(arr[j] + " ");
		}

	}
}
