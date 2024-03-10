package task3.ap1;

public class CopyEndy {
	public static void main(String[] args) {
		CopyEndy s = new CopyEndy();
		System.out.println(s.copyEndy(null, 0));
	}

	public int[] copyEndy(int[] nums, int count) {
		int res[] = new int[count];
		for (int i = 0, j = 0; i < nums.length; i++) {

			if (isEndy(nums[i]) != 0 && j < res.length) {
				res[j++] = nums[i];
			}
		}

		return res;
	}

	int isEndy(int n) {
		if (n >= 0 && n <= 10 || n >= 90 && n <= 100)
			return n;

		return 0;
	}

}
