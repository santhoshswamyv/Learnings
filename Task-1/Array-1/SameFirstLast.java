package array1;

public class SameFirstLast {
	public static void main(String[] args) {
		SameFirstLast s = new SameFirstLast();
		int nums[] = { 6, 6 };
		System.out.println(s.sameFirstLast(nums));
	}

	public boolean sameFirstLast(int[] nums) {
		if (nums.length >= 1 && nums[0] == nums[nums.length - 1])
			return true;

		return false;
	}

}
