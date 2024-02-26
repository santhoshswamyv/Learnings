package warmup2;

public class StringBits {
	public static void main(String[] args) {
		StringBits s = new StringBits();
		System.out.println(s.stringBits("Hello"));
	}

	public String stringBits(String str) {
		if (str.length() <= 1) {
			return str;
		}
		String res = "";
		for (int i = 0; i < str.length(); i = i + 2) {
			res += str.charAt(i);
		}

		return res;
	}

}
