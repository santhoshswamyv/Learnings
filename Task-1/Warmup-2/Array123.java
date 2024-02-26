package warmup2;

public class Array123 {
	public static void main(String[] args) {
		Array123 s = new Array123();
		int nums[] = { 3, 9, 5, 2, 3, 9 };
		System.out.println(s.array123(nums));
	}

	public boolean array123(int[] nums) {
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3)
				return true;
		}
		return false;
	}

}
