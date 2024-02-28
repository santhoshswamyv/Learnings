package logic1;

public class SumLimit {
	public static void main(String[] args) {
		SumLimit s = new SumLimit();
		System.out.println(s.sumLimit(0, 0));
	}

	public int sumLimit(int a, int b) {
		String aLen = String.valueOf(a);
		int n = a + b;
		String res = String.valueOf(n);

		if (aLen.length() == res.length())
			return a + b;

		return a;
	}

}
