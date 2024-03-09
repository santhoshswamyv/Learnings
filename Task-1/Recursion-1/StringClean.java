package task1;

public class StringClean {
	public static void main(String[] args) {
		StringClean s = new StringClean();
		System.out.println(s.stringClean("sfaeefew"));
	}

	public String stringClean(String str) {
		if (str.length() < 2)
			return str;
		if (str.charAt(1) != str.charAt(0))
			return "" + str.charAt(0) + stringClean(str.substring(1));
		return stringClean(str.substring(1));
	}

}
