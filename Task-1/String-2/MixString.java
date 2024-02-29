package string2;

public class MixString {
	public static void main(String[] args) {
		MixString s = new MixString();
		System.out.println(s.mixString("abc", "xyx"));
	}

	public String mixString(String a, String b) {
		String result = "";
		int maxLength = Math.max(a.length(), b.length());

		for (int i = 0; i < maxLength; i++) {
			if (i < a.length()) {
				result += a.charAt(i);
			}
			if (i < b.length()) {
				result += b.charAt(i);
			}
		}

		return result;
	}

}
