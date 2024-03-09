package task1;

public class StrCopies {
	public static void main(String[] args) {
		StrCopies s = new StrCopies();
		System.out.println(s.strCopies("cowcowocow", "cow", 0));
	}

	public boolean strCopies(String str, String sub, int n) {
		if (str.length() == 0)
			return n <= 0;
		if (sub.length() - 1 < str.length()) {
			if (str.substring(0, sub.length()).equals(sub)) {
				return strCopies(str.substring(1, str.length()), sub, n - 1);

			}
			return strCopies(str.substring(1, str.length()), sub, n);
		}
		return n <= 0;
	}

}
