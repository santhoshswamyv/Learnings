package task2;

import java.util.Arrays;

public class Question14 {
	public static void main(String[] args) {
		int nums[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int copy[] = new int[nums.length];
		for (int i = 0; i < copy.length; i++) {
			copy[i] = nums[i];
		}
		System.out.println(Arrays.toString(copy));
	}
}
