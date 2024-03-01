package array2;

public class No14 {
	public static void main(String[] args) {
		No14 s = new No14();
		int nums[]= {1, 2, 2, 6, 99, 99, 7};
		System.out.println(s.no14(nums));
	}

	public boolean no14(int[] nums) {
		boolean b1 = false;
		boolean b4 = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1)
				b1 = true;

			if (nums[i] == 4)
				b4 = true;
		}

		if (b1 && b4)
			return false;

		return true;
	}

}
