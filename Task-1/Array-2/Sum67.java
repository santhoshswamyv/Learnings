package array2;

public class Sum67 {
	public static void main(String[] args) {
		Sum67 s = new Sum67();
		int nums[]= {1, 2, 2, 6, 99, 99, 7};
		System.out.println(s.sum67(nums));
	}

	public int sum67(int[] nums) {
		boolean b = false;
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 6)
				b = true;
			else if (b && nums[i] == 7)
				b = false;
			else if (!b) {
				sum += nums[i];
			}
		}

		return sum;
	}

}
