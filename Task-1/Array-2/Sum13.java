package array2;

public class Sum13 {
	public static void main(String[] args) {
		Sum13 s = new Sum13();
		int nums[]= {1, 2, 2, 6, 13, 99, 7};
		System.out.println(s.sum13(nums));
	}

	public int sum13(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 13) {
				i++;
			} else {
				sum += nums[i];
			}
		}
		return sum;
	}

}
