package array1;

public class FrontPiece {
	public static void main(String[] args) {
		FrontPiece s = new FrontPiece();
		int nums[] = { 7, 3, 1 };
		System.out.println(s.frontPiece(nums));
	}

	public int[] frontPiece(int[] nums) {
		if (nums.length <= 2)
			return nums;

		int res[] = new int[2];
		res[0] = nums[0];
		res[1] = nums[1];
		return res;
	}

}
