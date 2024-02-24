package warmup1;

public class FrontBack {
	public static void main(String[] args) {
		FrontBack s = new FrontBack();
		System.out.println(s.frontBack("yandS"));
	}

	public String frontBack(String str) {
		if (str.length() <= 1)
			return str;

		String m = str.substring(1, str.length() - 1);
		str = str.charAt(str.length() - 1) + m + str.charAt(0);

		return str;
	}

}
