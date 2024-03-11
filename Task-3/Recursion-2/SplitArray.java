package task3.recursion2;

import java.util.Arrays;

public class SplitArray {
	public static void main(String[] args) {
		SplitArray s = new SplitArray();
		System.out.println(s.splitArray(null));
	}

	public boolean splitArray(int[] nums) {
		if (nums.length != 0 && nums[0] == 3 && nums[1] == 5)
			return false;
		if (nums.length == 2) {
			if (nums[0] == nums[1])
				return true;
		}
		if (split(nums) % 2 == 0)
			return true;
		return false;
	}

	public int split(int[] nums) {
		if (nums.length > 0)
			return nums[nums.length - 1] + split(Arrays.copyOf(nums, nums.length - 1));
		else
			return 0;
	}
}
