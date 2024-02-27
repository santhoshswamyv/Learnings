package array1;

public class SwapEnds {
	public static void main(String[] args) {
		SwapEnds s = new SwapEnds();
		int nums[] = { 7, 3, 1 };
		System.out.println(s.swapEnds(nums));
	}

	public int[] swapEnds(int[] nums) {
		if (nums.length <= 1)
			return nums;

		int temp = nums[0];
		nums[0] = nums[nums.length - 1];
		nums[nums.length - 1] = temp;
		return nums;
	}

}
