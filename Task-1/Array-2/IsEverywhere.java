package array2;

public class IsEverywhere {
	public static void main(String[] args) {
		IsEverywhere s = new IsEverywhere();
		int nums[]= {1, 2, 2, 6, 99, 99, 7};
		int n=4;
		System.out.println(s.isEverywhere(nums, n));
	}

	public boolean isEverywhere(int[] nums, int val) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != val && nums[i + 1] != val)
				return false;
		}

		return true;
	}

}
