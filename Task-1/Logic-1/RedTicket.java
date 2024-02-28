package logic1;

public class RedTicket {
	public static void main(String[] args) {
		RedTicket s = new RedTicket();
		System.out.println(s.redTicket(0, 0, 0));
	}

	public int redTicket(int a, int b, int c) {
		if (a == 2 && b == 2 && c == 2)
			return 10;
		else if (a == b && b == c)
			return 5;
		else if (a != b && a != c)
			return 1;

		return 0;
	}

}
