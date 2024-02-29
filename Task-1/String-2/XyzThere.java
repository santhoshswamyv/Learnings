package string2;

public class XyzThere {
	public static void main(String[] args) {
		XyzThere s = new XyzThere();
		System.out.println(s.xyzThere("xxxxxxxyz"));
	}

	public boolean xyzThere(String str) {
		int index = str.indexOf("xyz");
		if (index != -1) {
			for (int i = 0; i < str.length() - 2; i++) {
				if (index == 0 || (str.substring(i, i + 3)).equals("xyz") && str.charAt(i - 1) != '.')
					return true;
			}
		}

		return false;
	}

}
