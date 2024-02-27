package string1;

public class ExtraFront {
	public static void main(String[] args) {
		ExtraFront s = new ExtraFront();
		System.out.println(s.extraFront("Hello"));
	}

	public String extraFront(String str) {
		if (str.length() <= 2)
			return str + str + str;

		String first = str.substring(0, 2);
		return first + first + first;
	}

}
