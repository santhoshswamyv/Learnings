package string2;

public class OneTwo {
	public static void main(String[] args) {
		OneTwo s = new OneTwo();
		System.out.println(s.oneTwo("abaaba"));
	}

	public String oneTwo(String str) {
		String res = "";
		for (int i = 1; i < str.length() - 1; i += 3) {
			res += str.charAt(i) + "" + str.charAt(i + 1) + "" + str.charAt(i - 1);
		}

		return res;
	}

}
