package array2;

import java.util.Arrays;

public class CenteredAverage {
	public static void main(String[] args) {
		CenteredAverage s = new CenteredAverage();
		int nums[]= {1, 2, 2, 6, 99, 99, 7};
		System.out.println(s.centeredAverage(nums));
	}

	public int centeredAverage(int[] nums) {
		Arrays.sort(nums);
		int sum = 0;
		for (int i = 1; i < nums.length - 1; i++) {
			sum += nums[i];
		}
		return sum / (nums.length - 2);
	}

}
