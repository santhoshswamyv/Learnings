package task1;

public class StrCount {
	public static void main(String[] args) {
		StrCount s = new StrCount();
		System.out.println(s.strCount(null, null));
	}

	public int strCount(String str, String sub) {
		if (str.length() < sub.length()) {
			return 0;
		}

		if (str.substring(0, sub.length()).equals(sub))
			return 1 + strCount(str.substring(sub.length()), sub);
		else
			return strCount(str.substring(1), sub);
	}

}
