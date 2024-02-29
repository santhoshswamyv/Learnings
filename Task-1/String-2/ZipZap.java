package string2;

public class ZipZap {
	public static void main(String[] args) {
		ZipZap s = new ZipZap();
		System.out.println(s.zipZap("zipziap"));
	}

	public String zipZap(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (i < str.length() - 2 && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
				result += "zp";
				i += 2;
			} else {
				result += str.charAt(i);
			}
		}
		return result;
	}

}
