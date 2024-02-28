package logic2;

public class LuckySum {
	public static void main(String[] args) {
		LuckySum s = new LuckySum();
		System.out.println(s.luckySum(0, 0, 0));
	}

	public int luckySum(int a, int b, int c) {
		if (a == 13)
			return 0;
		else if (b == 13)
			return a;
		else if (c == 13)
			return a + b;

		return a + b + c;
	}

}
