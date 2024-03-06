package task2;

public class Question11 {

	public static void main(String[] args) {
		String result = "";
		String str = "a1b10";
		int i = 0;
		while (i < str.length()) {
			char letter = str.charAt(i);
			i++;
			int count = 0;
			while (i < str.length() && Character.isDigit(str.charAt(i))) {
				count = count * 10 + Character.getNumericValue(str.charAt(i));
				i++;
			}

			for (int j = 0; j < count; j++) {
				result+=letter;
			}
		}
		System.out.println(result);
	}
}
