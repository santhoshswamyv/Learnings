package task3.recursion2;

public class GroupSum6 {
	public static void main(String[] args) {
		GroupSum6 s = new GroupSum6();
		System.out.println(s.groupSum6(0, null, 0));
	}

	public boolean groupSum6(int start, int[] nums, int target) {
		if (start >= nums.length)
			return (target == 0);
		if (nums[start] == 6)
			return groupSum6(start + 1, nums, target - nums[start]);
		return groupSum6(start + 1, nums, target - nums[start]) || groupSum6(start + 1, nums, target);
	}
}
