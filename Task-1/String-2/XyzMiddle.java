package string2;

public class XyzMiddle {
	public static void main(String[] args) {
		XyzMiddle s = new XyzMiddle();
		System.out.println(s.xyzMiddle("axyzb"));
	}

	public boolean xyzMiddle(String str) {
		int len = str.length();
		int xyzIndex = str.indexOf("xyz");
		while (xyzIndex != -1) {
			int left = xyzIndex;
			int right = len - xyzIndex - 3;
			if (Math.abs(left - right) <= 1) {
				return true;
			}
			xyzIndex = str.indexOf("xyz", xyzIndex + 1);
		}
		return false;
	}

}
