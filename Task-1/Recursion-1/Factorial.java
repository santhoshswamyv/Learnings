package task1;

public class Factorial {
	public static void main(String[] args) {
		Factorial s = new Factorial();
		System.out.println(s.factorial(4));
	}

	public int factorial(int n) {
		if (n == 1)
			return n;
		else
			return n * factorial(n - 1);
	}

}
