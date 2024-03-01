package array2;

public class ShiftLeft {
	public static void main(String[] args) {
		ShiftLeft s = new ShiftLeft();
		int nums[]= {1, 2, 2, 6, 99, 99, 7};
		System.out.println(s.shiftLeft(nums));
	}

	public int[] shiftLeft(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			int temp = nums[i];
			nums[i] = nums[i + 1];
			nums[i + 1] = temp;
		}

		return nums;
	}

}
