package array2;

public class SameEnds {
	public static void main(String[] args) {
		SameEnds s = new SameEnds();
		int nums[]= {1, 2, 2, 6, 99, 99, 7};
		int len=4;
		System.out.println(s.sameEnds(nums, len));
	}

	public boolean sameEnds(int[] nums, int len) {
		for (int i = 0; i < len; i++) {
			if (nums[i] != nums[nums.length - len + i]) {
				return false;
			}
		}
		return true;
	}

}
