package logic2;

public class BlackJack {
	public static void main(String[] args) {
		BlackJack s = new BlackJack();
		System.out.println(s.blackjack(0, 0));
	}

	public int blackjack(int a, int b) {
		if (a > 21 && b > 21)
			return 0;
		else if (a > 21)
			return b;
		else if (b > 21)
			return a;

		return Math.max(a, b);
	}

}
