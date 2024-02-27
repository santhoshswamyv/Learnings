package string1;

public class WithoutX {
	public static void main(String[] args) {
		WithoutX s = new WithoutX();
		System.out.println(s.withoutX("xHix"));
	}

	public String withoutX(String str) {
		if (str.length() < 1)
			return "";

		if (str.length() > 1 && str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x')
			return str.substring(1, str.length() - 1);

		if (str.charAt(0) == 'x')
			return str.substring(1);
		else if (str.charAt(str.length() - 1) == 'x')
			return str.substring(0, str.length() - 1);

		return str;
	}

}
