package logic2;

public class NoTeenSum {
	public static void main(String[] args) {
		NoTeenSum s = new NoTeenSum();
		System.out.println(s.noTeenSum(0, 0, 0));
	}

	public int noTeenSum(int a, int b, int c) {
		return fixTeen(a) + fixTeen(b) + fixTeen(c);
	}

	public int fixTeen(int n) {
		if (n >= 13 && n <= 19 && n != 15 && n != 16)
			return 0;

		return n;
	}

}
