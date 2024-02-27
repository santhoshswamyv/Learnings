package string1;

public class FrontAgain {
	public static void main(String[] args) {
		FrontAgain s = new FrontAgain();
		System.out.println(s.frontAgain("edited"));
	}

	public boolean frontAgain(String str) {

		if (str.length() <= 1)
			return false;

		if (str.length() == 2)
			return true;

		if ((str.substring(0, 2)).equals(str.substring(str.length() - 2)))
			return true;

		return false;
	}

}
