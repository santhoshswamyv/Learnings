package sorting.incrementalapproach;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		bubbleSort(new int[] { 4, 3, 8, 5, 2, 1 });
	}

	public static void bubbleSort(int nums[]) {
		int length = nums.length;
		boolean swapped;
		do {
			swapped = false;
			for (int i = 1; i < length; i++) {
				if (nums[i - 1] > nums[i]) {
					swap(nums, i - 1, i);
					swapped = true;
				}
			}
			length--;
		} while (swapped);
		System.out.println(Arrays.toString(nums));
	}

	public static void swap(int nums[], int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
