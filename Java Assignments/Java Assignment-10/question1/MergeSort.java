package javaassignment10.question1;

public class MergeSort implements Sortable {
	@Override
	public void sort(int[] nums) {
		System.out.println("Before Sorting using Quick Sort..!");
		for (int i : nums) {
			System.out.print(i + " ");
		}

		mergeSort(nums, 0, nums.length - 1);

		System.out.println("After Sorting using Bubble Sort..!");
		for (int i : nums) {
			System.out.print(i + " ");
		}

	}

	public void mergeSort(int[] nums, int start, int end) {
		if (start >= end) {
			return;
		}
		int mid = (start + end) / 2;
		mergeSort(nums, start, mid);
		mergeSort(nums, mid + 1, end);
		merge(nums, start, mid, end);
	}

	public void merge(int[] nums, int start, int mid, int end) {
		int[] temp = new int[end - start + 1];
		int left = start;
		int right = mid + 1;
		int i = 0;
		while (left <= mid && right <= end) {
			if (nums[left] < nums[right]) {
				temp[i] = nums[left];
				left++;
			} else {
				temp[i] = nums[right];
				right++;
			}
			i++;
		}
		while (left <= mid) {
			temp[i] = nums[left];
			left++;
			i++;
		}

		while (right <= end) {
			temp[i] = nums[right];
			right++;
			i++;
		}
		for (int j = 0; j < temp.length; j++) {
			nums[start + j] = temp[j];
		}
	}
}
