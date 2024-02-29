package string2;

public class PrefixAgain {
	public static void main(String[] args) {
		PrefixAgain s = new PrefixAgain();
		System.out.println(s.prefixAgain("Hello", 2));
	}

	public boolean prefixAgain(String str, int n) {
		String word = str.substring(0, n);

		for (int i = n; i <= str.length() - n; i++) {
			if (word.equals(str.substring(i, i + n)))
				return true;
		}

		return false;
	}

}
