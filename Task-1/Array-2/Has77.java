package array2;

public class Has77 {
	public static void main(String[] args) {
		Has77 s = new Has77();
		int nums[]= {1, 2, 2, 6, 99, 99, 7};
		System.out.println(s.has77(nums));
	}

	public boolean has77(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++)
			if (nums[i] == 7 && (nums[i + 1] == 7 || (i < nums.length - 2 && nums[i + 2] == 7))) {
				return true;
			}
		return false;
	}

}
