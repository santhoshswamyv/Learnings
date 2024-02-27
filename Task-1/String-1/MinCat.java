package string1;

public class MinCat {
	public static void main(String[] args) {
		MinCat s = new MinCat();
		System.out.println(s.minCat("x", "abc"));
	}

	public String minCat(String a, String b) {
		if (a.length() > b.length())
			return a.substring(a.length() - b.length()) + b;

		if (b.length() > a.length())
			return a + b.substring(b.length() - a.length());

		return "";
	}

}
