package array2;

public class ZeroFront {
	public static void main(String[] args) {
		ZeroFront s = new ZeroFront();
		int nums[]= {1, 2, 2, 6, 99, 99, 7};
		System.out.println(s.zeroFront(nums));
	}

	public int[] zeroFront(int[] nums) {
		int res[] = new int[nums.length];

		for (int i = 0, j = nums.length - 1, k = 0; k < nums.length; k++) {
			if (nums[k] == 0) {
				res[i] = nums[k];
				i++;
			} else {
				res[j] = nums[k];
				j--;
			}
		}

		return res;
	}

}
