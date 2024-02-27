package array1;

public class No23 {
	public static void main(String[] args) {
		No23 s = new No23();
		int nums[] = { 7, 3, 1 };
		System.out.println(s.no23(nums));
	}

	public boolean no23(int[] nums) {
		if (nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3)
			return false;

		return true;
	}

}
