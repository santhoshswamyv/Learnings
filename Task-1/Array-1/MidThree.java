package array1;

public class MidThree {
	public static void main(String[] args) {
		MidThree s = new MidThree();
		int nums[] = { 7, 3, 1 };
		System.out.println(s.midThree(nums));
	}

	public int[] midThree(int[] nums) {
		if (nums.length <= 3)
			return nums;

		int res[] = new int[3];
		res[0] = nums[(nums.length / 2) - 1];
		res[1] = nums[(nums.length / 2)];
		res[2] = nums[(nums.length / 2) + 1];

		return res;
	}

}
