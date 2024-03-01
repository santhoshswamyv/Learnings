package array2;

public class Sum28 {
	public static void main(String[] args) {
		Sum28 s = new Sum28();
		int nums[]= {1, 2, 2, 6, 99, 99, 7};
		System.out.println(s.sum28(nums));
	}

	public boolean sum28(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2)
				sum += nums[i];
		}

		if (sum == 8)
			return true;

		return false;
	}

}
