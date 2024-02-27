package array1;

public class Reverse3 {
	public static void main(String[] args) {
		Reverse3 s = new Reverse3();
		int nums[] = { 7, 3, 1 };
		System.out.println(s.reverse3(nums));
	}

	public int[] reverse3(int[] nums) {
		int temp = nums[2];
		nums[2] = nums[0];
		nums[0] = temp;
		return nums;
	}

}
