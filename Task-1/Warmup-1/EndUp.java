package warmup1;

public class EndUp {
	public static void main(String[] args) {
		EndUp s = new EndUp();
		System.out.println(s.endUp("hello"));
	}

	public String endUp(String str) {
		if (str.length() <= 2)
			return str.toUpperCase();

		String last = str.substring(str.length() - 3, str.length());
		return str.substring(0, str.length() - 3) + last.toUpperCase();
	}

}
