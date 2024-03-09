package task1;

public class Count7 {
	public static void main(String[] args) {
		Count7 s = new Count7();
		System.out.println(s.count7(0));
	}

	public int count7(int n) {
		int c = 0;
		if (n == 0)
			return c;
		if (n % 10 == 7) {
			return 1 + count7(n / 10);
		}
		return count7(n / 10);
	}
}
