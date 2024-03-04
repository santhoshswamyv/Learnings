package string3;

public class CountYZ {
	public static void main(String[] args) {
		CountYZ s = new CountYZ();
		System.out.println(s.countYZ(null));
	}

	public int countYZ(String str) {
		str = str.toLowerCase() + " ";
		char letters[] = str.toCharArray();
		int count = 0;
		for (int i = 0; i < letters.length - 1; i++) {
			if ((letters[i] == 'z' || letters[i] == 'y') && !Character.isLetter(letters[i + 1])) {
				count++;
			}
		}

		return count;
	}

}
