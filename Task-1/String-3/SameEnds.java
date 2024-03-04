package string3;

public class SameEnds {
	public static void main(String[] args) {
		SameEnds s = new SameEnds();
		System.out.println(s.sameEnds(null));
	}

	public String sameEnds(String string) {
		if (string.length() % 2 == 0) {
			for (int findex = string.length() / 2,
					lindex = string.length() / 2; findex <= string.length() / 2; findex--, lindex++) {
				if (string.substring(0, findex).equals(string.substring(lindex, string.length()))) {
					return string.substring(0, findex);
				}
			}
		} else {
			for (int findex = string.length() / 2,
					lindex = string.length() / 2 + 1; findex <= string.length() / 2; findex--, lindex++) {
				if (string.substring(0, findex).equals(string.substring(lindex, string.length()))) {
					return string.substring(0, findex);
				}
			}
		}
		return "";

	}
}
