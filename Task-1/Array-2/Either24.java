package array2;

public class Either24 {
	public static void main(String[] args) {
		Either24 s = new Either24();
		int nums[]= {1, 2, 2, 6, 99, 99, 7};
		System.out.println(s.either24(nums));
	}

	public boolean either24(int[] nums) {
		int c = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 2 && nums[i + 1] == 2 || nums[i] == 4 && nums[i + 1] == 4)
				c++;
		}

		return c == 1;
	}

}
