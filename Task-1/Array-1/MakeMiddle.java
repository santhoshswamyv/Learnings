package array1;

public class MakeMiddle {
	public static void main(String[] args) {
		MakeMiddle s = new MakeMiddle();
		int nums[] = { 7, 3, 1 };
		System.out.println(s.makeMiddle(nums));
	}

	public int[] makeMiddle(int[] nums) {
		int res[] = new int[2];
		res[0] = nums[(nums.length / 2) - 1];
		res[1] = nums[(nums.length / 2)];

		return res;
	}

}
