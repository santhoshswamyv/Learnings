package task1;

public class SumDigits {
	public static void main(String[] args) {
		SumDigits s = new SumDigits();
		System.out.println(s.sumDigits(0));
	}

	public int sumDigits(int n) {
		if (n == 0)
			return n;
		return n % 10 + sumDigits(n / 10);
	}

}
