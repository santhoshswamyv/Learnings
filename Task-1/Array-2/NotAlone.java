package array2;

public class NotAlone {
	public static void main(String[] args) {
		NotAlone s = new NotAlone();
		int nums[]= {1, 2, 2, 6, 99, 99, 7};
		int n=4;
		System.out.println(s.notAlone(nums, n));
	}

	public int[] notAlone(int[] nums, int val) {
		for (int i = 1; i < nums.length - 1; i++) {
			if (nums[i] == val) {
				if (nums[i - 1] != val && nums[i + 1] != val) {
					nums[i] = Math.max(nums[i - 1], nums[i + 1]);
				}
			}
		}
		return nums;
	}

}
