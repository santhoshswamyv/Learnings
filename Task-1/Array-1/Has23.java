package array1;

public class Has23 {
	public static void main(String[] args) {
		Has23 s = new Has23();
		int nums[] = { 7, 3, 1 };
		System.out.println(s.has23(nums));
	}

	public boolean has23(int[] nums) {
		if (nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3)
			return true;

		return false;
	}

}
