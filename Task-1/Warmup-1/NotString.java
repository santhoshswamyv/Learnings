package warmup1;

public class NotString {
	public static void main(String[] args) {
		NotString s = new NotString();
		System.out.println(s.notString("not"));
	}

	public String notString(String str) {
		if (str.length() >= 3)
			if (str.substring(0, 3).equals("not"))
				return str;

		return "not " + str;
	}

}
