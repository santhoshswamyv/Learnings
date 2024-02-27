package string1;

public class TheEnd {
	public static void main(String[] args) {
		TheEnd s = new TheEnd();
		System.out.println(s.theEnd("Hello", false));
	}

	public String theEnd(String str, boolean front) {
		if (front)
			return "" + str.charAt(0);

		return "" + str.charAt(str.length() - 1);
	}

}
