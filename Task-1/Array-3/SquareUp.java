package array3;

public class SquareUp {
	public static void main(String[] args) {
		SquareUp s = new SquareUp();
		System.out.println(s.squareUp(4));
	}

	public int[] squareUp(int n) {
		int nums[] = new int[n * n];
		int series = n;
		int j = nums.length - 1;

		for (int i = 0; i < n; i++) {
			int temp = 1;
			int k = j;
			while (temp <= series) {
				nums[k--] = temp++;
			}
			series--;
			j -= n;
		}

		return nums;
	}

}
