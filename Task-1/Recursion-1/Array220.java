package task1;

public class Array220 {
	public static void main(String[] args) {
		Array220 s = new Array220();
		int nums[] = { 1, 11, 3, 11, 11 };
		System.out.println(s.array220(nums, 0));
	}

	public boolean array220(int[] nums, int index) {
		if (index >= nums.length - 1) {
			return false;
		}
		if (nums[index] * 10 == nums[index + 1])
			return true;
		return array220(nums, ++index);
	}
}
