package task1;

public class Array6 {
	public static void main(String[] args) {
		int arr[] = { 1, 6, 4 };
		int index = 0;
		Array6 s = new Array6();
		System.out.println(s.array6(arr, index));
	}

	public boolean array6(int[] nums, int index) {
		if (index == nums.length) {
			return false;
		}

		if (nums[index] == 6) {
			return true;
		}

		return array6(nums, index + 1);

	}

}
