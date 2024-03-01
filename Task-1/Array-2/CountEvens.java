package array2;

public class CountEvens {
	public static void main(String[] args) {
		CountEvens s = new CountEvens();
		int nums[]= {1, 2, 2, 6, 99, 99, 7};
		System.out.println(s.countEvens(nums));
	}

	public int countEvens(int[] nums) {
		int c = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0)
				c++;
		}

		return c;
	}

}
