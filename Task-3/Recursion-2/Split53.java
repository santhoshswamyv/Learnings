package task3.recursion2;

public class Split53 {
	public static void main(String[] args) {
		Split53 s = new Split53();
		System.out.println(s.split53(null));
	}

	public boolean split53(int[] nums) {
		return helper(nums, 0, 0, 0);
	}

	private boolean helper(int[] nums, int index, int sum1, int sum2) {
		if (index >= nums.length)
			return sum1 == sum2;

		if (nums[index] % 5 == 0)
			return helper(nums, index + 1, sum1 + nums[index], sum2);

		if (nums[index] % 3 == 0)
			return helper(nums, index + 1, sum1, sum2 + nums[index]);

		if (helper(nums, index + 1, sum1 + nums[index], sum2))
			return true;

		if (helper(nums, index + 1, sum1, sum2 + nums[index]))
			return true;

		return false;
	}

}
