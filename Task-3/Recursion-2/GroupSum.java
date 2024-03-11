package task3.recursion2;

public class GroupSum {
	public static void main(String[] args) {
		GroupSum s = new GroupSum();
		System.out.println(s.groupSum(0, null, 0));
	}

	public boolean groupSum(int start, int[] nums, int target) {
		if (start >= nums.length)
			return (target == 0);
		if (groupSum(start + 1, nums, target - nums[start]))
			return true;
		if (groupSum(start + 1, nums, target))
			return true;
		return false;
	}

}
