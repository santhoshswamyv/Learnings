package logic1;

public class MaxMod5 {
	public static void main(String[] args) {
		MaxMod5 s = new MaxMod5();
		System.out.println(s.maxMod5(0, 0));
	}

	public int maxMod5(int a, int b) {
		if (a != b && a % 5 == b % 5)
			return Math.min(a, b);
		else if (a == b)
			return 0;

		return Math.max(a, b);

	}

}
