package warmup1;

public class Front3 {
	public static void main(String[] args) {
		Front3 s = new Front3();
		System.out.println(s.front3("Ja"));
	}

	public String front3(String str) {
		if (str.length() >= 3) {
			String s = str.substring(0, 3);
			return s + s + s;
		}

		return str + str + str;
	}

}
