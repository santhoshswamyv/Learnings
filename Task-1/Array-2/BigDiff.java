package array2;

public class BigDiff {
	public static void main(String[] args) {
		BigDiff s = new BigDiff();
		int nums[]= {1, 2, 2, 6, 99, 99, 7};
		System.out.println(s.bigDiff(nums));
	}

	public int bigDiff(int[] nums) {
		int max = 0;
		int min = nums[0];
		for (int i = 0; i < nums.length; i++) {
			max = Math.max(max, nums[i]);
			min = Math.min(min, nums[i]);
		}

		return max - min;
	}

}
