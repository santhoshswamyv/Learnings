package string1;

public class ComboString {
	public static void main(String[] args) {
		ComboString s = new ComboString();
		System.out.println(s.comboString("Sandy", "Hi"));
	}

	public String comboString(String a, String b) {
		if (b.length() < a.length())
			return b + a + b;

		return a + b + a;
	}

}
