package warmup1;

public class EveryNth {
	public static void main(String[] args) {
		EveryNth s = new EveryNth();
		System.out.println(s.everyNth("Sandy", 2));
	}

	public String everyNth(String str, int n) {
		String res = "";
		for (int i = 0; i < str.length(); i = i + n) {
			res += str.charAt(i);
		}
		return res;
	}

}
