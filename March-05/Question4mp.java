package day1;

public class Question4mp {
	public static void main(String[] args) {
		String str = "(((())))";
		System.out.println(nestParen(str));
	}

	public static boolean nestParen(String str) {
		if (str.length() == 0) {
			return true;
		}

		if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
			return nestParen(str.substring(1, str.length() - 1));
		} else {
			return false;
		}
	}
}
