package string2;

public class GetSandwich {
	public static void main(String[] args) {
		GetSandwich s = new GetSandwich();
		System.out.println(s.getSandwich("breadbreadbread"));
	}

	public String getSandwich(String str) {
		int first = str.indexOf("bread");
		int last = str.lastIndexOf("bread");

		if (first != -1 && last != -1 && first != last) {
			return str.substring(first + 5, last);
		} else {
			return "";
		}
	}

}
