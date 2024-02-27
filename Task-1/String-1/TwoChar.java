package string1;

public class TwoChar {
	public static void main(String[] args) {
		TwoChar s = new TwoChar();
		System.out.println(s.twoChar("Hello", 1));
	}

	public String twoChar(String str, int index) {
		if (index < 0 || index > str.length() - 2)
			return str.substring(0, 2);

		return str.substring(index, index + 2);
	}

}
