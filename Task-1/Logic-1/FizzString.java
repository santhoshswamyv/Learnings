package logic1;

public class FizzString {
	public static void main(String[] args) {
		FizzString s = new FizzString();
		System.out.println(s.fizzString("fizz"));
	}

	public String fizzString(String str) {
		if (str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b')
			return "FizzBuzz";

		if (str.charAt(0) == 'f')
			return "Fizz";

		if (str.charAt(str.length() - 1) == 'b')
			return "Buzz";

		return str;
	}

}
