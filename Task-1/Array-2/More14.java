package array2;

public class More14 {
	public static void main(String[] args) {
		More14 s = new More14();
		int nums[]= {1, 2, 2, 6, 99, 99, 7};
		System.out.println(s.more14(nums));
	}

	public boolean more14(int[] nums) {
		int c1 = 0;
		int c4 = 0;

		for (int num : nums) {
			if (num == 1)
				c1++;

			if (num == 4)
				c4++;
		}

		if (c1 > c4)
			return true;

		return false;
	}

}
