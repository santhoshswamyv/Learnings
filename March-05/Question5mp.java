package day1;

public class Question5mp {
	public static void main(String[] args) {
		String str = "xyz(abc)123";
		System.out.println(parenBit(str));
	}

	public static String parenBit(String str) {

		if (str.charAt(0) == '(') {
			if (str.charAt(str.length() - 1) == ')') {
				return str;
			} else {
				return parenBit(str.substring(0, str.length() - 1));
			}
		} else {
			return parenBit(str.substring(1));
		}

	}
}
