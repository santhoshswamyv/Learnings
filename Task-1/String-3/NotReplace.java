package string3;

public class NotReplace {
	public static void main(String[] args) {
		NotReplace s = new NotReplace();
		System.out.println(s.notReplace(null));
	}

	public String notReplace(String str) {
		String res = "";
		str = " " + str + "  ";

		for (int i = 1; i < str.length() - 2; i++) {
			if (str.substring(i, i + 2).equals("is") && !Character.isLetter(str.charAt(i - 1))
					&& !Character.isLetter(str.charAt(i + 2))) {
				res += "is not";
				i++;
			} else {
				res += str.charAt(i);
			}
		}

		return res;
	}

}
