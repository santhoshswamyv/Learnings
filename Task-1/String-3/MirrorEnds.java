package string3;

public class MirrorEnds {
	public static void main(String[] args) {
		MirrorEnds s = new MirrorEnds();
		System.out.println(s.mirrorEnds(null));
	}

	public String mirrorEnds(String string) {
		String res = "";
		for (int i = 0, j = string.length() - 1; i < string.length(); i++, j--) {
			if (string.charAt(i) == string.charAt(j)) {
				res += string.charAt(i);
			} else {
				break;
			}
		}

		return res;
	}

}
