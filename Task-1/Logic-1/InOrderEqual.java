package logic1;

public class InOrderEqual {
	public static void main(String[] args) {
		InOrderEqual s = new InOrderEqual();
		System.out.println(s.inOrderEqual(0, 0, 0, false));
	}

	public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		if (equalOk && a <= b && b <= c || b > a && c > b)
			return true;

		return false;
	}

}
