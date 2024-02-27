package string1;

public class HasBad {
	public static void main(String[] args) {
		HasBad s = new HasBad();
		System.out.println(s.hasBad("badxxx"));
	}

	public boolean hasBad(String str) {
		if (str.indexOf("bad") != -1 && str.indexOf("bad") <= 1)
			return true;

		return false;
	}

}
