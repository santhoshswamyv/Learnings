package string2;

public class BobThere {
	public static void main(String[] args) {
		BobThere s = new BobThere();
		System.out.println(s.bobThere("bob"));
	}

	public boolean bobThere(String str) {
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b')
				return true;
		}

		return false;
	}

}
