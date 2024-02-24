package warmup1;

public class Front22 {
	public static void main(String[] args) {
		Front22 s = new Front22();
		System.out.println(s.front22("A"));
	}

	public String front22(String str) {
		if (str.length() > 2)
			return str.substring(0, 2) + str + str.substring(0, 2);

		return str + str + str;
	}

}
