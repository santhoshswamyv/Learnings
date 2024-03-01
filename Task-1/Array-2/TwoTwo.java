package array2;

public class TwoTwo {
	public static void main(String[] args) {
		TwoTwo s = new TwoTwo();
		int nums[]= {1, 2, 2, 6, 99, 99, 7};
		System.out.println(s.twoTwo(nums));
	}

	public boolean twoTwo(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2) {
				if (!(i > 0 && nums[i - 1] == 2 || i < nums.length - 1 && nums[i + 1] == 2))
					return false;
			}
		}
		return true;
	}

}
