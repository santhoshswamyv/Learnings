package string2;

public class EndOther {
	public static void main(String[] args) {
		EndOther s = new EndOther();
		System.out.println(s.endOther("sandy", "sandy"));
	}

	public boolean endOther(String a, String b) {
		if (a.length() >= b.length())
			return a.substring(a.length() - b.length()).toLowerCase().equals(b.toLowerCase());
		else if (b.length() > a.length())
			return b.substring(b.length() - a.length()).toLowerCase().equals(a.toLowerCase());

		return false;

	}

}
