package string1;

public class SeeColor {
	public static void main(String[] args) {
		SeeColor s = new SeeColor();
		System.out.println(s.seeColor("redxxx"));
	}

	public String seeColor(String str) {
		if (str.indexOf("red") == 0)
			return "red";

		if (str.indexOf("blue") == 0)
			return "blue";

		return "";
	}

}
