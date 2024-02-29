package string2;

public class RepeatEnd {
	public static void main(String[] args) {
		RepeatEnd s = new RepeatEnd();
		System.out.println(s.repeatEnd("Hi", 0));
	}

	public String repeatEnd(String str, int n) {
		String last = str.substring(str.length() - n);
		String res = "";

		for (int i = 0; i < n; i++) {
			res += last;
		}

		return res;
	}

}
