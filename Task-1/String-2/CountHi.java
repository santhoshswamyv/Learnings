package string2;

public class CountHi {
	public static void main(String[] args) {
		CountHi s = new CountHi();
		System.out.println(s.countHi("hihihi"));
	}

	public int countHi(String str) {
		int c = 0;
		for (int i = 0; i < str.length() - 1; i++)
			if ((str.substring(i, i + 2)).equals("hi"))
				c++;

		return c;
	}

}
