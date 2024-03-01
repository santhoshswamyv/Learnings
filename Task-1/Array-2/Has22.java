package array2;

public class Has22 {
	public static void main(String[] args) {
		Has22 s = new Has22();
		int nums[]= {1, 2, 2, 6, 99, 99, 7};
		System.out.println(s.has22(nums));
	}

	public boolean has22(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 2 && nums[i + 1] == 2)
				return true;
		}

		return false;
	}

}
