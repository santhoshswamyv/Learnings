package array3;

public class Fix34 {
	public static void main(String[] args) {
		Fix34 s = new Fix34();
		int nums[] = { 1, 3, 1, 4, 4, 3, 1 };
		System.out.println(s.fix34(nums));
	}

	public int[] fix34(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 3 && nums[i + 1] != 4) {
				for (int j = 0; j < nums.length; j++) {
					if (nums[j] == 4 && (j == 0 || nums[j - 1] != 3)) {
						int temp = nums[j];
						nums[j] = nums[i + 1];
						nums[i + 1] = temp;
						break;
					}
				}
			}
		}
		return nums;
	}

}