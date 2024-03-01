package array2;

public class HaveThree {
	public static void main(String[] args) {
		HaveThree s = new HaveThree();
		int nums[]= {1, 2, 2, 6, 99, 99, 7};
		System.out.println(s.haveThree(nums));
	}

	public boolean haveThree(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 3) {
				if (i < nums.length - 1 && nums[i + 1] == 3) {
					return false;
				}
				count++;
			}
		}
		return count == 3;
	}

}
