package warmup2;

public class Has271 {
	public static void main(String[] args) {
		Has271 s = new Has271();
		int nums[] = { 4, 5, 3, 8, 0 };
		System.out.println(s.has271(nums));
	}

	public boolean has271(int[] nums) {
		for (int i = 0; i < nums.length - 2; i++) {
			int start = nums[i];
			if (nums[i + 1] - start == 5 && Math.abs(nums[i + 2] - (start - 1)) <= 2) {
				return true;
			}
		}
		return false;
	}

}
