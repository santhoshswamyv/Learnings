package logic2;

public class LoneSum {
	public static void main(String[] args) {
		LoneSum s = new LoneSum();
		System.out.println(s.loneSum(0, 0, 0));
	}

	public int loneSum(int a, int b, int c) {
		if (a == b && b == c)
			return 0;
		else if (a == b)
			return c;
		else if (a == c)
			return b;
		else if (b == c)
			return a;

		return a + b + c;

	}

}
