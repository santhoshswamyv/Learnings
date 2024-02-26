package warmup2;

public class StringTimes {
	public static void main(String[] args) {
		StringTimes s = new StringTimes();
		System.out.println(s.stringTimes("hi", 0));
	}

	public String stringTimes(String str, int n) {
		String res = "";
		for (int i = 0; i < n; i++)
			res += str;

		return res;
	}

}
