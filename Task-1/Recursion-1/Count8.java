package task1;

public class Count8 {
	public static void main(String[] args) {
		Count8 s = new Count8();
		System.out.println(s.count8(0));
	}

	public int count8(int n) {
		if (n == 0)
			return 0;
		if (n % 10 == 8) {
			if ((n / 10) % 10 == 8) {
				return 2 + count8(n / 10);
			}
			return 1 + count8(n / 10);
		} else {
			return count8(n / 10);
		}
	}

}
