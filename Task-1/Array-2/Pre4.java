package array2;

public class Pre4 {
	public static void main(String[] args) {
		Pre4 s = new Pre4();
		int nums[]= {1, 2, 2, 6, 99, 99, 7};
		System.out.println(s.pre4(nums));
	}

	public int[] pre4(int[] nums) {

		int j = 0;

		while (nums[j] != 4) {
			j++;
		}

		int res[] = new int[j];

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 4) {
				break;
			}

			res[i] = nums[i];
		}

		return res;
	}

}
