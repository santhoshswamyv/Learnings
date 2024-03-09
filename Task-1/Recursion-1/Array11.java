package task1;

public class Array11 {
	public static void main(String[] args) {
		Array11 s = new Array11();
		int nums[] = { 1, 11, 3, 11, 11 };
		System.out.println(s.array11(nums, 0));
	}

	public int array11(int[] nums, int index) {
		if (index == nums.length)
			return 0;
		if (nums[index] == 11)
			return 1 + array11(nums, ++index);

		return array11(nums, ++index);

	}

}
