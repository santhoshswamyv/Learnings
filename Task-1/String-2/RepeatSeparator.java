package string2;

public class RepeatSeparator {
	public static void main(String[] args) {
		RepeatSeparator s = new RepeatSeparator();
		System.out.println(s.repeatSeparator("Sandy", "X", 2));
	}

	public String repeatSeparator(String word, String sep, int count) {
		String res = "";
		for (int i = 0; i < count - 1; i++) {
			res += word + sep;
		}

		return count > 0 ? res += word : "";
	}

}
