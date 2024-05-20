package sorting.incrementalapproach;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		selectionSort(new int[] { 4, 1, 5, 2, 8, 7, 9 });
	}

	public static void selectionSort(int nums[]) {
		for (int i = 0; i < nums.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] < nums[min]) {
					min = j;
				}
			}
			swap(nums, i, min);
		}
		System.out.println(Arrays.toString(nums));
	}

	public static void swap(int nums[], int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
