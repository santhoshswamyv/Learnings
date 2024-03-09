package task1;

public class ParenBit {
	public static void main(String[] args) {
		ParenBit s = new ParenBit();
		System.out.println(s.parenBit("sfasdsf"));
	}

	public String parenBit(String str) {
		if (str.length() == 0)
			return str;
		if (str.charAt(0) == '(') {
			if (str.charAt(str.length() - 1) == ')')
				return str;
			else
				return parenBit(str.substring(0, str.length() - 1));
		}
		return parenBit(str.substring(1));
	}

}
