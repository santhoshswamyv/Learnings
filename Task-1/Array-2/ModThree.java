package array2;

public class ModThree {
	public static void main(String[] args) {
		ModThree s = new ModThree();
		int nums[]= {1, 2, 2, 6, 99, 99, 7};
		System.out.println(s.modThree(nums));
	}

	public boolean modThree(int[] nums) {
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0
					|| nums[i] % 2 != 0 && nums[i + 1] % 2 != 0 && nums[i + 2] % 2 != 0)
				return true;
		}
		return false;
	}

}
