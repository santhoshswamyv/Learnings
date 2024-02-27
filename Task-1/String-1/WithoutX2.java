package string1;

public class WithoutX2 {
	public static void main(String[] args) {
		WithoutX2 s = new WithoutX2();
		System.out.println(s.withoutX2("xxhi"));
	}

	public String withoutX2(String str) {
		if (str.length() == 1 && str.charAt(0) == 'x')
			return "";
		else if (str.length() <= 1)
			return str;

		if (str.length() >= 2 && str.charAt(0) == 'x' && str.charAt(1) == 'x')
			return str.substring(2);
		else if (str.charAt(0) == 'x')
			return str.substring(1);
		else if (str.charAt(1) == 'x')
			return "" + str.charAt(0) + str.substring(2);

		return str;

	}

}
