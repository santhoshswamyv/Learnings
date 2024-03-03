package array3;

public class MaxMirror {
	public static void main(String[] args) {
		MaxMirror s = new MaxMirror();
		int nums[] = { 1, 2, 3, 8, 9, 3, 2, 1 };
		System.out.println(s.maxMirror(nums));
	}

	public int maxMirror(int[] nums) {
		int max = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = nums.length - 1; j >= 0; j--) {
				int k = 0;
				while (i + k < nums.length && j - k >= 0 && nums[i + k] == nums[j - k]) {
					k++;
				}
				max = Math.max(max, k);
			}
		}

		return max;
	}

}
