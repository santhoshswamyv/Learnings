package array3;

public class SeriesUp {
	public static void main(String[] args) {
		SeriesUp s = new SeriesUp();
		System.out.println(s.seriesUp(4));
	}

	public int[] seriesUp(int n) {
		int nums[] = new int[n * (n + 1) / 2];
		int series = n;
		int j = nums.length - 1;
		for (int i = 0; i < nums.length; i++) {
			int temp = series;
			while (temp >= 1) {
				nums[j--] = temp--;
			}
			series--;
		}
		return nums;
	}

}
