package logic1;

public class LastDigit {
	public static void main(String[] args) {
		LastDigit s = new LastDigit();
		System.out.println(s.lastDigit(0, 0, 0));
	}

	public boolean lastDigit(int a, int b, int c) {
		if (a % 10 == b % 10 || b % 10 == c % 10 || a % 10 == c % 10)
			return true;
		return false;
	}

}
