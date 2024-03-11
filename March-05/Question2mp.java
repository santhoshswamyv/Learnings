package march05;

public class Question2mp {
	public static void main(String[] args) {
		String str = "xxhixxhixx";
		System.out.println(countHi(str));
	}

	public static int countHi(String str) {
		if (str.length() <= 1) {
			return 0;
		}

		if (str.substring(0, 2).equals("hi")) {
			return 1 + countHi(str.substring(1));
		} else {
			return countHi(str.substring(1));
		}
	}
}
