package array2;

public class Lucky13 {
	public static void main(String[] args) {
		Lucky13 s = new Lucky13();
		int nums[]= {1, 2, 2, 6, 99, 99, 7,13};
		System.out.println(s.lucky13(nums));
	}

	public boolean lucky13(int[] nums) {
		boolean b1 = false;
		boolean b3 = false;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1)
				b1 = true;

			if (nums[i] == 3)
				b3 = true;

			if (b1 || b3)
				return false;
		}

		return true;
	}

}
