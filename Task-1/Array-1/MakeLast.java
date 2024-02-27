package array1;

public class MakeLast {
	public static void main(String[] args) {
		MakeLast s = new MakeLast();
		int nums[] = { 7, 3, 1 };
		System.out.println(s.makeLast(nums));
	}

	public int[] makeLast(int[] nums) {
		int res[] = new int[nums.length + nums.length];
		res[res.length - 1] = nums[nums.length - 1];
		return res;
	}

}
