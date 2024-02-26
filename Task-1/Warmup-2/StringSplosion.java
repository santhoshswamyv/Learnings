package warmup2;

public class StringSplosion {
	public static void main(String[] args) {
		StringSplosion s = new StringSplosion();
		System.out.println(s.stringSplosion("Sandy"));
	}

	public String stringSplosion(String str) {
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			res += str.substring(0, i + 1);
		}
		return res;
	}

}
