package string2;

public class StarOut {
	public static void main(String[] args) {
		StarOut s = new StarOut();
		System.out.println(s.starOut("****"));
	}

	public String starOut(String str) {
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '*' || i > 0 && str.charAt(i - 1) == '*'
					|| i < str.length() - 1 && str.charAt(i + 1) == '*') {
				continue;
			}
			res += str.charAt(i);
		}

		return res;
	}

}
