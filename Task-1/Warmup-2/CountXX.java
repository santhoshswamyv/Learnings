package warmup2;

public class CountXX {
	public static void main(String[] args) {
		CountXX s = new CountXX();
		System.out.println(s.countXX("xxxxxx"));
	}

	int countXX(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.substring(i, i + 2).equals("xx"))
				count++;
		}
		return count;
	}

}
