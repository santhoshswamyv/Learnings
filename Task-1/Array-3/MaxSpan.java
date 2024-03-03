package array3;

import java.util.Arrays;

public class MaxSpan {
	public static void main(String[] args) {
		MaxSpan s = new MaxSpan();
		int nums[] = { 1, 4, 2, 1, 4, 1, 4 };
		System.out.println(s.maxSpan(nums));
	}

	public int maxSpan(int[] nums) {
		int span[] = new int[nums.length];
		int firstIndex = 0;
		int lastIndex = 0;
		for (int i = 0; i < nums.length; i++) {
			firstIndex = i;
			for (int j = nums.length - 1; j >= 0; j--) {
				if (nums[i] == nums[j]) {
					lastIndex = j;
					break;
				}
			}
			span[i] = lastIndex - firstIndex + 1;
		}
		Arrays.sort(span);

		return span.length > 0 ? span[span.length - 1] : 0;
	}

}
