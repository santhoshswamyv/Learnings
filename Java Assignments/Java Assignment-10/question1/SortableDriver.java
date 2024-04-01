package javaassignment10.question1;

import java.util.Scanner;

public class SortableDriver {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		boolean b = true;

		while (b) {
			System.err.println(
					"Choose one of the Sorting Algorithms...\n\n1) Bubble Sort \n2) Quick Sort \n3) Merge Sort");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				Sortable bs = new BubbleSort();
				bs.sort(gettingInput());
				break;
			case 2:
				Sortable qs = new QuickSort();
				qs.sort(gettingInput());
				break;
			case 3:
				Sortable ms = new MergeSort();
				ms.sort(gettingInput());
				break;
			case 4:
				b = false;
				break;
			default:
				System.err.println("Choose valid Option..!");
				break;
			}
		}
	}

	static int[] gettingInput() {
		System.out.print("\n\nEnter the Size of the Array : ");
		int size = sc.nextInt();
		int nums[] = new int[size];

		for (int i = 0; i < nums.length; i++) {
			System.out.print("Enter the " + (i + 1) + " element : ");
			nums[i] = sc.nextInt();
		}

		return nums;
	}
}
