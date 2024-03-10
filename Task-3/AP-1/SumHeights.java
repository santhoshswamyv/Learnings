package task3.ap1;

public class SumHeights {
	public static void main(String[] args) {
		SumHeights s = new SumHeights();
		System.out.println(s.sumHeights(null, 0, 0));
	}

	public int sumHeights(int[] heights, int start, int end) {
		int sum = 0;
		for (int i = start; i < end; i++) {
			sum += Math.abs(heights[i] - heights[i + 1]);
		}
		return sum;
	}

}
