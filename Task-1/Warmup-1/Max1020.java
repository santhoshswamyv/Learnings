package warmup1;

public class Max1020 {
	public static void main(String[] args) {
		Max1020 s = new Max1020();
		System.out.println(s.max1020(11, 20));
	}

	public int max1020(int a, int b) {
		if (b > a) {
			int temp = a;
			a = b;
			b = temp;

		}
		if (a >= 10 && a <= 20)
			return a;
		if (b >= 10 && b <= 20)
			return b;

		return 0;
	}

}
