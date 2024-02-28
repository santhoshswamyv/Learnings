package logic1;

public class TeenSum {
	public static void main(String[] args) {
		TeenSum s = new TeenSum();
		System.out.println(s.teenSum(0, 0));
	}

	public int teenSum(int a, int b) {
		if (a >= 13 && a <= 19 || b >= 13 && b <= 19)
			return 19;

		return a + b;
	}

}
