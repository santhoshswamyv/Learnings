package string2;

public class DoubleChar {
	public static void main(String[] args) {
		DoubleChar s = new DoubleChar();
		System.out.println(s.doubleChar("hi"));
	}

	public String doubleChar(String str) {
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			res += str.charAt(i) + "" + str.charAt(i);
		}

		return res;
	}

}
