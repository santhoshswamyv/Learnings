package string2;

public class PlusOut {
	public static void main(String[] args) {
		PlusOut s = new PlusOut();
		System.out.println(s.plusOut("134533SW", "SW"));
	}

	public String plusOut(String str, String word) {
		int len = word.length();
		String res = "";
		int i = 0;
		while (i < str.length()) {
			if (i <= str.length() - len && str.substring(i, i + len).equals(word)) {
				res += word;
				i += len;
			} else {
				res += "+";
				i++;
			}
		}
		return res;
	}

}
