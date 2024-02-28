package logic1;

public class GreenTicket {
	public static void main(String[] args) {
		GreenTicket s = new GreenTicket();
		System.out.println(s.greenTicket(0, 0, 0));
	}

	public int greenTicket(int a, int b, int c) {

		if (a == b && b == c)
			return 20;

		if (a == b || b == c || a == c)
			return 10;

		return 0;
	}

}
