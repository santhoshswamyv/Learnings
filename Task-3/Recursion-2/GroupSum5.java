package task3.recursion2;

public class GroupSum5 {
	public static void main(String[] args) {
		GroupSum5 s = new GroupSum5();
		System.out.println(s.groupSum5(0, null, 0));
	}

	public boolean groupSum5(int start, int[] nums, int target) {
		if (nums.length <= start)
			if (target == 0)
				return true;
			else
				return false;

		if (nums.length - 1 > start && nums[start + 1] == 1)
			return groupSum5(start + 2, nums, target - nums[start]);
		if (nums[start] % 5 == 0)
			return groupSum5(start + 1, nums, target - nums[start]);

		return groupSum5(start + 1, nums, target - nums[start]) || groupSum5(start + 1, nums, target);
	}
}
