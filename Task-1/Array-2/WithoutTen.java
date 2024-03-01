package array2;

public class WithoutTen {
	public static void main(String[] args) {
		WithoutTen s = new WithoutTen();
		int nums[]= {1, 2, 2, 6, 99, 99, 7};
		System.out.println(s.withoutTen(nums));
	}

	public int[] withoutTen(int[] nums) {
		int res[] = new int[nums.length];
		for (int i = 0, j = 0; i < nums.length; i++) {
			if (nums[i] != 10) {
				res[j++] = nums[i];
			}
		}

		return res;
	}

}
