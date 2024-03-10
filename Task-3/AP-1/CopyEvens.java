package task3.ap1;

public class CopyEvens {
	public static void main(String[] args) {
		CopyEvens s = new CopyEvens();
		System.out.println(s.copyEvens(null, 0));
	}

	public int[] copyEvens(int[] nums, int count) {

		int arr[] = new int[count];
		int i = 0;
		for (int n = 0; n < nums.length; n++) {
			if (nums[n] % 2 == 0) {
				if (i < count)
					arr[i++] = nums[n];
				else
					break;
			}
		}
		return arr;
	}

}
