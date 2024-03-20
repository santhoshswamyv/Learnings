package exercism;

public class PangramChecker {

	public boolean isPangram(String input) {
		boolean isTrue[] = new boolean[25];
		input = input.toUpperCase();
		for (int i = 0; i < input.length(); i++) {
			int index = ((int) input.charAt(i)) - 65;
			if (index >= 0 && index < isTrue.length) {
				isTrue[index] = true;
			}
		}

		for (boolean b : isTrue) {
			if (!b)
				return false;
		}

		return true;
	}

}
