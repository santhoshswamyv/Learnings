package logic1;

public class InOrder {
	public static void main(String[] args) {
		InOrder s = new InOrder();
		System.out.println(s.inOrder(0, 0, 0, false));
	}

	public boolean inOrder(int a, int b, int c, boolean bOk) {
		if (bOk && c > b || b > a && c > b)
			return true;

		return false;
	}

}
