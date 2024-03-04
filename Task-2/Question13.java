package task2;

import java.util.Scanner;

public class Question13 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int nums[] = new int[sc.nextInt()];
		int i = 0;
		while (i < nums.length) {
			nums[i++] = sc.nextInt();
		}

		int min=nums[0];
		for (i = 0; i < nums.length - 1; i++) {
			min = Math.min(min, nums[i + 1]);
		}
		System.out.println(min);
	}
}
