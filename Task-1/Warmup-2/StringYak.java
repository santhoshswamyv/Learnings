package warmup2;

public class StringYak {
	public static void main(String[] args) {
		StringYak s = new StringYak();
		System.out.println(s.stringYak("yaskpak"));
	}

	public String stringYak(String str) {
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
				i += 2;
			} else {
				res += str.charAt(i);
			}
		}

		return res;
	}

}
