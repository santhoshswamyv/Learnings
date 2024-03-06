package task1;

public class PowerN {
	public static void main(String[] args) {
		PowerN s = new PowerN();
		System.out.println(s.powerN(3, 2));
	}

	public int powerN(int base, int n) {
		if (n == 1)
			return base;

		return base * powerN(base, n - 1);
	}

}
