package array2;

public class TenRun {
	public static void main(String[] args) {
		TenRun s = new TenRun();
		int nums[]= {1, 2, 2, 6, 99, 99, 7};
		System.out.println(s.tenRun(nums));
	}

	public int[] tenRun(int[] nums) {
		boolean b = false;
		int temp = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 10 == 0) {
				temp = nums[i];
				b = true;
			}

			if (b)
				nums[i] = temp;

		}

		return nums;
	}

}
