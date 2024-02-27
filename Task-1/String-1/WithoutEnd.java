package string1;

public class WithoutEnd {
	public static void main(String[] args) {
		WithoutEnd s = new WithoutEnd();
		System.out.println(s.withoutEnd("Hello"));
	}

	public String withoutEnd(String str) {
		if (str.length() < 2)
			return str;

		return str.substring(1, str.length() - 1);
	}

}
