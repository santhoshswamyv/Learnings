package array1;

public class Double23 {
	public static void main(String[] args) {
		Double23 s = new Double23();
		int nums[] = { 7, 3, 1 };
		System.out.println(s.double23(nums));
	}

	public boolean double23(int[] nums) {
		if (nums.length <= 1)
			return false;

		if (nums.length == 2 && nums[0] == 2 && nums[1] == 2 || nums[0] == 3 && nums[1] == 3)
			return true;
		else if (nums.length == 2)
			return false;

		if (nums.length > 2 && nums[0] == 2 && nums[1] == 2 || nums[1] == 2 && nums[2] == 2
				|| nums[0] == 3 && nums[1] == 3 || nums[1] == 3 && nums[2] == 3)
			return true;

		return false;
	}

}
