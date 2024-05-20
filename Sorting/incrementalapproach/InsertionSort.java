package sorting.incrementalapproach;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		insertionSort(new int[] { 4, 1, 5, 2, 8, 7, 9 });
	}

	public static void insertionSort(int nums[]) {
		for (int i = 1; i < nums.length; i++) {
			int j = i;
			while (j > 0 && nums[j] < nums[j - 1]) {
				swap(nums, j, j-1);
				j--;
			}
		}
		System.out.println(Arrays.toString(nums));
	}

	public static void swap(int nums[], int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
