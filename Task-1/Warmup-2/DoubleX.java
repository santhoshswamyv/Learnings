package warmup2;

public class DoubleX {
	public static void main(String[] args) {
		DoubleX s = new DoubleX();
		System.out.println(s.doubleX("xaxx"));
	}

	boolean doubleX(String str) {
		int i = str.indexOf("x");
		if (i != -1 && i != str.length() - 1) {
			if (str.charAt(i) == str.charAt(i + 1))
				return true;
		}

		return false;
	}

}
