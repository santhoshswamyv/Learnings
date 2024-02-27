package array1;

public class Fix23 {
	public static void main(String[] args) {
		Fix23 s = new Fix23();
		int nums[] = { 7, 3, 1 };
		System.out.println(s.fix23(nums));
	}

	public int[] fix23(int[] nums) {
		if (nums[0] == 2 && nums[1] == 3) {
			nums[1] = 0;
			return nums;
		}

		if (nums[1] == 2 && nums[2] == 3)
			nums[2] = 0;
		return nums;
	}

}
