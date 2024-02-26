package warmup2;

public class ArrayCount9 {
	public static void main(String[] args) {
		ArrayCount9 s = new ArrayCount9();
		int nums[] = { 3, 9, 5, 2, 3, 9 };
		System.out.println(s.arrayCount9(nums));
	}

	public int arrayCount9(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 9)
				count++;
		}

		return count;
	}

}
