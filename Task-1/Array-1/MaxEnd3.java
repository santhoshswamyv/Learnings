package array1;

public class MaxEnd3 {
	public static void main(String[] args) {
		MaxEnd3 s = new MaxEnd3();
		int nums[] = { 7, 3, 1 };
		System.out.println(s.maxEnd3(nums));
	}

	public int[] maxEnd3(int[] nums) {
		int max = Math.max(nums[0], nums[2]);
		nums[0] = max;
		nums[1] = max;
		nums[2] = max;
		return nums;
	}

}
