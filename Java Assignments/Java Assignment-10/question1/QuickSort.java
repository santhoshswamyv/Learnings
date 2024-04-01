package javaassignment10.question1;

public class QuickSort implements Sortable {
	@Override
	public void sort(int[] nums) {
		System.out.println("Before Sorting using Quick Sort..!");
		for (int i : nums) {
			System.out.print(i + " ");
		}

		quickSort(nums, 0, nums.length - 1);

		System.out.println("After Sorting using Bubble Sort..!");
		for (int i : nums) {
			System.out.print(i + " ");
		}

	}

	void quickSort(int[] nums, int start, int end) {

		if (end <= start) {
			return;
		}

		int pivot = partition(nums, start, end);
		quickSort(nums, pivot + 1, end);
		quickSort(nums, start, pivot - 1);

	}

	int partition(int[] nums, int start, int end) {
		int pivot = nums[end];
		int j = start - 1;
		for (int i = start; i <= end; i++) {
			if (nums[i] < pivot) {
				j++;
				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
			}
		}
		j++;
		int temp = nums[j];
		nums[j] = nums[end];
		nums[end] = temp;

		return j;
	}

}
