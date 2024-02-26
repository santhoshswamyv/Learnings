package warmup2;

public class AltPairs {
	public static void main(String[] args) {
		AltPairs s = new AltPairs();
		System.out.println(s.altPairs("Kitten"));
	}

	public String altPairs(String str) {
		String res = "";
		for (int i = 0; i < str.length(); i += 4) {
			int end = i + 2;
			if (end > str.length()) {
				end = str.length();
			}
			res += str.substring(i, end);
		}
		return res;
	}

}
