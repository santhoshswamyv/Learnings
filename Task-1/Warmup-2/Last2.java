package warmup2;

public class Last2 {
	public static void main(String[] args) {
		Last2 s = new Last2();
		System.out.println(s.last2("HiaaHi"));
	}

	public int last2(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 2; i++) {
			if ((str.substring(i, i + 2)).equals(str.substring(str.length() - 2)))
				count++;
		}

		return count;
	}

}
