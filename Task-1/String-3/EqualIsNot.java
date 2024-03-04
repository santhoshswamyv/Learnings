package string3;

public class EqualIsNot {
	public static void main(String[] args) {
		EqualIsNot s = new EqualIsNot();
		System.out.println(s.equalIsNot(null));
	}

	public boolean equalIsNot(String str) {
		int isCount = 0;
		int notCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (i <= str.length() - 2 && str.substring(i, i + 2).equals("is")) {
				isCount++;
			}
			if (i <= str.length() - 3 && str.substring(i, i + 3).equals("not")) {
				notCount++;
			}
		}

		return isCount == notCount;
	}

}
