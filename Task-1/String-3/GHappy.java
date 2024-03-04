package string3;

public class GHappy {
	public static void main(String[] args) {
		GHappy s = new GHappy();
		System.out.println(s.gHappy(null));
	}

	public boolean gHappy(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'g') {
				if (i > 0 && str.charAt(i - 1) == 'g') {
					continue;
				}
				if (i < str.length() - 1 && str.charAt(i + 1) == 'g') {
					continue;
				}
				return false;
			}
		}
		return true;
	}

}
