package task3.recursion2;

public class GroupSumClump {
	public static void main(String[] args) {
		GroupSumClump s = new GroupSumClump();
		System.out.println(s.groupSumClump(0, null, 0));
	}

	public boolean groupSumClump(int start, int[] nums, int target) {
		if (start >= nums.length)
			return target == 0;

		int i = start;
		int sum = 0;

		while (i < nums.length && nums[start] == nums[i]) {
			sum += nums[i];
			i++;
		}

		if (groupSumClump(i, nums, target - sum))
			return true;

		if (groupSumClump(i, nums, target))
			return true;

		return false;
	}

}
