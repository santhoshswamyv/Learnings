package evaluation1;

import java.util.Arrays;
import java.util.Scanner;

public class Question3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int num1Size = sc.nextInt();
		int num2Size = sc.nextInt();

		int num1[] = new int[num1Size];
		int num2[] = new int[num2Size];

		int t = 0;
		while (t < num1Size) {
			num1[t++] = sc.nextInt();
		}

		t = 0;
		while (t < num1Size) {
			num2[t++] = sc.nextInt();
		}

//		int num1[] = { 9, 2, 8, 1, 3, 5, 6, 7, 3, 1, 1, 6 };
//		int num2[] = { 7, 8, 4, 6, 2, 1, 9, 9, 7 };

		int res[] = new int[Math.max(num1.length, num2.length) + 1];

		int c = 0;
		for (int i = num1.length - 1, j = num2.length - 1, k = res.length - 1; i >= 0 || j >= 0 || c > 0;) {
			int sum = c;
			if (i >= 0) {
				sum += num1[i];
			}
			if (j >= 0) {
				sum += num2[j];
			}

			res[k] = sum % 10;
			c = sum / 10;

			i--;
			j--;
			k--;
		}

		System.out.print(Arrays.toString(res));
	}
}
