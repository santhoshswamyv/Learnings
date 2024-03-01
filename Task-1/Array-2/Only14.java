package array2;

public class Only14 {
	public static void main(String[] args) {
		Only14 s = new Only14();
		int nums[]= {1, 2, 2, 6, 99, 99, 7};
		System.out.println(s.only14(nums));
	}

	public boolean only14(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 1 && nums[i] != 4)
				return false;
		}

		return true;
	}

}
