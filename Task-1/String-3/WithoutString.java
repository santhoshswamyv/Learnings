package string3;

public class WithoutString {
	public static void main(String[] args) {
		WithoutString s = new WithoutString();
		System.out.println(s.withoutString("Hello there", "llo"));
	}

	public String withoutString(String base, String remove) {
		String result = "";
		int i = 0;
		while (i < base.length()) {
			if (base.toLowerCase().startsWith(remove.toLowerCase(), i)) {
				i += remove.length();
			} else {
				result += base.charAt(i);
				i++;
			}
		}
		return result;
	}

}
