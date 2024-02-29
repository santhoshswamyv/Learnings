package string2;

public class WordEnds {
	public static void main(String[] args) {
		WordEnds s = new WordEnds();
		System.out.println(s.wordEnds("abc", "a"));
	}

	public String wordEnds(String str, String word) {
		String res = "";
		int len = word.length();
		for (int i = 0; i <= str.length() - len; i++) {
			if (str.substring(i, i + len).equals(word)) {
				if (i > 0) {
					res += str.charAt(i - 1);
				}
				if (i + len < str.length()) {
					res += str.charAt(i + len);
				}
			}
		}
		return res;
	}

}
