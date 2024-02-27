package array1;

public class MakeEnds {
	public static void main(String[] args) {
		MakeEnds s = new MakeEnds();
		int nums[] = { 7, 3, 1 };
		System.out.println(s.makeEnds(nums));
	}

	public int[] makeEnds(int[] nums) {
		if (nums.length <= 1) {
			int res[] = { nums[0], nums[0] };
			return res;
		}

		int res[] = { nums[0], nums[nums.length - 1] };

		return res;
	}

}
