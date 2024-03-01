package array2;

public class ZeroMax {
	public static void main(String[] args) {
		ZeroMax s = new ZeroMax();
		int nums[] = { 1, 2, 2, 6, 99, 99, 7 };
		System.out.println(s.zeroMax(nums));
	}

	public int[] zeroMax(int[] nums) {
		int maxOdd = 0;
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] % 2 != 0) {
				maxOdd = Math.max(maxOdd, nums[i]);
			}
			if (nums[i] == 0) {
				nums[i] = maxOdd;
			}
		}
		return nums;
	}

}
