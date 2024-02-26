package warmup2;

public class StringMatch {
	public static void main(String[] args) {
		StringMatch s = new StringMatch();
		System.out.println(s.stringMatch("Hello", "Hello"));
	}

	public int stringMatch(String a, String b) {
		int lnt = Math.min(a.length(), b.length());
		int count = 0;
		for (int i = 0; i < lnt - 1; i++) {
			String st1 = a.substring(i, i + 2);
			String st2 = b.substring(i, i + 2);
			if (st1.equals(st2))
				count++;
		}
		return count;
	}

}
