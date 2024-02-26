package warmup2;

public class ArrayFront9 {
	public static void main(String[] args) {
		ArrayFront9 s = new ArrayFront9();
		int nums[] = { 3, 9, 5, 2, 3, 9 };
		System.out.println(s.arrayFront9(nums));
	}

	public boolean arrayFront9(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (i < 4 && nums[i] == 9)
				return true;
		}

		return false;
	}

}
