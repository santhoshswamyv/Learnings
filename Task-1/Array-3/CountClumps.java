package array3;

public class CountClumps {
	public static void main(String[] args) {
		CountClumps s = new CountClumps();
		int nums[] = { 1, 2, 2, 3, 4, 4 };
		System.out.println(s.countClumps(nums));
	}

	public int countClumps(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				count++;
				while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
					i++;
				}
			}
		}
		return count;
	}

}
