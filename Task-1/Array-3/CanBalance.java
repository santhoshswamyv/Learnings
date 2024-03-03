package array3;

public class CanBalance {
	public static void main(String[] args) {
		CanBalance s = new CanBalance();
		int nums[] = { 1, 1, 1, 2, 1 };
		System.out.println(s.canBalance(nums));
	}

	public boolean canBalance(int[] nums) {
		int sum1 = 0;
		for (int num : nums) {
			sum1 += num;
		}

		int sum2 = 0;
		for (int i = nums.length - 1; i >= 0; i--) {
			sum2 += nums[i];
			sum1 -= nums[i];

			if (sum1 == sum2) {
				return true;
			}
		}

		return false;
	}

}
