package string1;

public class DeFront {
	public static void main(String[] args) {
		DeFront s = new DeFront();
		System.out.println(s.deFront("abc"));
	}

	public String deFront(String str) {
		if (str.charAt(0) == 'a' && str.charAt(1) == 'b')
			return str;

		if (str.charAt(0) == 'a' && str.charAt(1) != 'b')
			return "" + str.charAt(0) + str.substring(2);

		if (str.charAt(0) != 'a' && str.charAt(1) == 'b')
			return str.substring(1);

		return str.substring(2);
	}

}
