package string1;

public class EndsLy {
	public static void main(String[] args) {
		EndsLy s = new EndsLy();
		System.out.println(s.endsLy("Oddly"));
	}

	public boolean endsLy(String str) {
		if (str.length() <= 1)
			return false;

		if (str.charAt(str.length() - 2) == 'l' && str.charAt(str.length() - 1) == 'y')
			return true;

		return false;
	}

}
