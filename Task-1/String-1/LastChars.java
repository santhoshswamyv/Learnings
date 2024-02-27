package string1;

public class LastChars {
	public static void main(String[] args) {
		LastChars s = new LastChars();
		System.out.println(s.lastChars("Sandy", "SD"));
	}

	public String lastChars(String a, String b) {
		if (a.length() >= 1 && b.length() >= 1)
			return "" + a.charAt(0) + b.charAt(b.length() - 1);

		if (a.length() == 0 && b.length() == 0)
			return "@@";

		if (a.length() < 1 && b.length() > 0)
			return "@" + b.charAt(b.length() - 1);

		return "" + a.charAt(0) + "@";
	}

}
