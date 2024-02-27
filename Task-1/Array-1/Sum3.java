package array1;

public class Sum3 {
	public static void main(String[] args) {
		Sum3 s = new Sum3();
		int nums[] = { 7, 3, 1 };
		System.out.println(s.sum3(nums));
	}

	public int sum3(int[] nums) {
		return nums[0] + nums[1] + nums[2];
	}

}
