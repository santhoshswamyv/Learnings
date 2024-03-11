package task3.recursion2;

public class GroupNoAdj {
	public static void main(String[] args) {
		GroupNoAdj s = new GroupNoAdj();
		System.out.println(s.groupNoAdj(0, null, 0));
	}

	public boolean groupNoAdj(int start, int[] nums, int target) {
		if (nums.length <= start) {
			if (target == 0)
				return true;
			else
				return false;
		}
		return groupNoAdj(start + 2, nums, target - nums[start]) || groupNoAdj(start + 1, nums, target);
	}

}
