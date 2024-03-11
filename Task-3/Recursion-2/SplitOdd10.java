package task3.recursion2;

public class SplitOdd10 {
	public static void main(String[] args) {
		SplitOdd10 s = new SplitOdd10();
		System.out.println(s.splitOdd10(null));
	}

	public boolean splitOdd10(int[] nums) {
		return helper(nums, 0, 0, 0);
	}

	private boolean helper(int[] nums, int index, int sum1, int sum2) {
		if (index >= nums.length)
			return sum1 % 10 == 0 && sum2 % 2 == 1;

		if (helper(nums, index + 1, sum1 + nums[index], sum2))
			return true;

		if (helper(nums, index + 1, sum1, sum2 + nums[index]))
			return true;

		return false;
	}

}
