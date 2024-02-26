package warmup2;

public class StringX {
	public static void main(String[] args) {
		StringX s = new StringX();
		System.out.println(s.stringX("xHisdsdzcacascHix"));
	}

	public String stringX(String str) {
		if (str.length() <= 1)
			return str;
		String result = str.substring(0, 1);
		for (int i = 1; i < str.length() - 1; i++) {
			if (!(str.substring(i, i + 1)).equals("x"))
				result += str.charAt(i);
		}

		return result + str.charAt(str.length() - 1);
	}

}
