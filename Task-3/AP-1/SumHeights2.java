package task3.ap1;

public class SumHeights2 {
	public static void main(String[] args) {
		SumHeights2 s = new SumHeights2();
		System.out.println(s.sumHeights2(null, 0, 0));
	}

	public int sumHeights2(int[] heights, int start, int end) {
		int sum = 0;
		for (int i = start; i < end; i++) {
			if (heights[i] < heights[i + 1]) {
				sum += 2 * (heights[i + 1] - heights[i]);
			} else {
				sum += heights[i] - heights[i + 1];
			}
		}
		return sum;
	}

}
