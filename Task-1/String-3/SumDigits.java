package string3;

public class SumDigits {
	public static void main(String[] args) {
		SumDigits s = new SumDigits();
		System.out.println(s.sumDigits(null));
	}

	public int sumDigits(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				sum += Integer.parseInt("" + str.charAt(i));
			}
		}

		return sum;
	}

}
