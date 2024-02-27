package array1;

public class Sum2 {
	public static void main(String[] args) {
		Sum2 s = new Sum2();
		int nums[] = { 7, 3, 1 };
		System.out.println(s.sum2(nums));
	}

	public int sum2(int[] nums) {
		if (nums.length == 0)
			return 0;

		if (nums.length < 2)
			return nums[0];

		return nums[0] + nums[1];

	}

}
