package array1;

public class RotateLeft3 {
	public static void main(String[] args) {
		RotateLeft3 s = new RotateLeft3();
		int nums[] = { 7, 3, 1 };
		System.out.println(s.rotateLeft3(nums));
	}

	public int[] rotateLeft3(int[] nums) {
		int temp = nums[0];
		nums[0] = nums[2];
		nums[2] = temp;
		temp = nums[0];
		nums[0] = nums[1];
		nums[1] = temp;
		return nums;
	}

}
