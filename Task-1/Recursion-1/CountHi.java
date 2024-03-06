package task1;

public class CountHi {
	public static void main(String[] args) {
		CountHi s = new CountHi();
		System.out.println(s.countHi("xxhixxhi"));
	}

	public int countHi(String str) {
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
