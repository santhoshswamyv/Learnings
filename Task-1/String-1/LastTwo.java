package string1;

public class LastTwo {
	public static void main(String[] args) {
		LastTwo s = new LastTwo();
		System.out.println(s.lastTwo("Sandy"));
	}

	public String lastTwo(String str) {
		if (str.length() <= 1)
			return str;

		if (str.length() == 2)
			return "" + str.charAt(str.length() - 1) + str.charAt(0);

		return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
	}

}
