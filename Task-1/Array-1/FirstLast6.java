package array1;

public class FirstLast6 {
	public static void main(String[] args) {
		FirstLast6 s = new FirstLast6();
		int nums[] = { 6, 6 };
		System.out.println(s.firstLast6(nums));
	}

	public boolean firstLast6(int[] nums) {
		if (nums[0] == 6 || nums[nums.length - 1] == 6)
			return true;

		return false;
	}

}
