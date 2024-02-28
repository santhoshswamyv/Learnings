package logic2;

public class RoundSum {
	public static void main(String[] args) {
		RoundSum s = new RoundSum();
		System.out.println(s.roundSum(0, 0, 0));
	}

	public int roundSum(int a, int b, int c) {
		return Math.abs(round10(a) + round10(b) + round10(c));
	}

	public int round10(int num) {
		if (num % 10 >= 5) {
			return ((num / 10) + 1) * 10;
		}

		return (num / 10) * 10;
	}

}
