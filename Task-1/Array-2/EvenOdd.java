package array2;

public class EvenOdd {
	public static void main(String[] args) {
		EvenOdd s= new EvenOdd();
		int nums[]= {1, 2, 2, 6, 99, 99, 7};
		System.out.println(s.evenOdd(nums));
	}

	public int[] evenOdd(int[] nums) {
		int res[] = new int[nums.length];

		for (int i = 0, j = nums.length - 1, k = 0; k < nums.length; k++) {
			if (nums[k] % 2 == 0) {
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
