package array2;

public class Has12 {
	public static void main(String[] args) {
		Has12 s = new Has12();
		int nums[]= {1, 2, 12, 6, 99, 99, 7};
		System.out.println(s.has12(nums));
	}

	public boolean has12(int[] nums) {
		boolean b1 = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1)
				b1 = true;

			if (b1 && nums[i] == 2)
				return true;
		}
		return false;

	}

}
