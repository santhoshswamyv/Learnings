package task1;

public class CountHi2 {
	public static void main(String[] args) {
		CountHi2 s = new CountHi2();
		System.out.println(s.countHi2("hisdhi"));
	}

	public int countHi2(String str) {
		if (str.length() <= 1)
			return 0;
		int len = str.length();
		if (str.substring(len - 2, len).equals("hi")) {
			if ((len > 2 && str.charAt(len - 3) != 'x') || len == 2) {
				return 1 + countHi2(str.substring(0, len - 1));

			}
		}
		return countHi2(str.substring(0, len - 1));
	}

}
