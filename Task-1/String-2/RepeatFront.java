package string2;

public class RepeatFront {
	public static void main(String[] args) {
		RepeatFront s = new RepeatFront();
		System.out.println(s.repeatFront("hill", 0));
	}

	public String repeatFront(String str, int n) {
		String res = "";
		int index = n;
		for (int i = 0; i < n; i++) {
			String first = str.substring(0, index--);
			res += first;
		}

		return res;
	}

}
