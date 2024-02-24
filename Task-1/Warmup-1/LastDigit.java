package warmup1;

public class LastDigit {
	public static void main(String[] args) {
		LastDigit s = new LastDigit();
		System.out.println(s.lastDigit(0, 0));
	}

	public boolean lastDigit(int a, int b) {
		return a % 10 == b % 10;
	}

}
