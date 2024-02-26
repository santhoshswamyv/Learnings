package warmup2;

public class Array667 {
	public static void main(String[] args) {
		Array667 s = new Array667();
		int nums[] = { 6, 7, 2, 6 };
		System.out.println(s.array667(nums));
	}

	public int array667(int[] nums) {
		int count = 0;

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 6 && nums[i + 1] == 6 || nums[i + 1] == 7)
				count++;
		}

		return count;
	}

}
