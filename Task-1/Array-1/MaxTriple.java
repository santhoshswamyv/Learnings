package array1;

public class MaxTriple {
	public static void main(String[] args) {
		MaxTriple s = new MaxTriple();
		int nums[] = { 7, 3, 1 };
		System.out.println(s.maxTriple(nums));
	}

	public int maxTriple(int[] nums) {
		if (nums.length == 1)
			return nums[0];

		int max = Math.max(nums[0], nums[nums.length / 2]);
		return Math.max(max, nums[nums.length - 1]);
	}

}
