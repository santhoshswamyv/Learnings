package string2;

public class CountCode {
	public static void main(String[] args) {
		CountCode s = new CountCode();
		System.out.println("code");
	}

	public int countCode(String str) {
		int c = 0;
		for (int i = 0; i < str.length() - 3; i++) {
			if ((str.substring(i, i + 2) + str.charAt(i + 3)).equals("coe"))
				c++;
		}

		return c;
	}

}
