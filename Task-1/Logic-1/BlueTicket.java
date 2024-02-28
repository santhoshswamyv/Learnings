package logic1;

public class BlueTicket {
	public static void main(String[] args) {
		BlueTicket s = new BlueTicket();
		System.out.println(s.blueTicket(0, 0, 0));
	}

	public int blueTicket(int a, int b, int c) {
		if (a + b == 10 || b + c == 10 || a + c == 10)
			return 10;

		if (a + b == b + c + 10 || a + b == a + c + 10)
			return 5;

		return 0;
	}

}
