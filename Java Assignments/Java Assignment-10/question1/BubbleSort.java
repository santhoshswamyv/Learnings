package javaassignment10.question1;

public class BubbleSort implements Sortable {

	@Override
	public void sort(int[] nums) {

		System.out.println("Before Sorting using Bubble Sort..!");
		for (int i : nums) {
			System.out.print(i + " ");
		}

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length - i - 1; j++) {
				if (nums[j] > nums[j + 1]) {

					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("After Sorting using Bubble Sort..!");
		for (int i : nums) {
			System.out.print(i + " ");
		}
	}

}
