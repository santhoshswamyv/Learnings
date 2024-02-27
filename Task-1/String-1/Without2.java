package string1;

public class Without2 {
	public static void main(String[] args) {
		Without2 s = new Without2();
		System.out.println(s.without2("HelloHi"));
	}

	public String without2(String str) {

		if (str.length() == 1)
			return str;

		if (str.length() <= 2)
			return "";

		if ((str.substring(0, 2)).equals(str.substring(str.length() - 2)))
			return str.substring(2);

		return str;

	}

}
