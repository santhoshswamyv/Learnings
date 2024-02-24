package warmup1;

public class SumDouble {
	public static void main(String[] args) {
		SumDouble s = new SumDouble();
		System.out.println(s.sumDouble(0, 0));
	}

	public int sumDouble(int a, int b) {
		if (a == b)
			return (a + b) * 2;

		return a + b;
	}

}
