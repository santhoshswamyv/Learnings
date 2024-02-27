package string1;

public class AtFirst {
	public static void main(String[] args) {
		AtFirst s = new AtFirst();
		System.out.println(s.atFirst("Hello"));
	}

	public String atFirst(String str) {

		if (str.length() < 1)
			return "@@";

		if (str.length() == 1)
			return str.charAt(0) + "@";

		return str.substring(0, 2);

	}

}
