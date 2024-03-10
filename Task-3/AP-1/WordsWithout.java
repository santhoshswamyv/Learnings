package task3.ap1;

public class WordsWithout {
	public static void main(String[] args) {
		WordsWithout s = new WordsWithout();
		System.out.println(s.wordsWithout(args, null));
	}

	public String[] wordsWithout(String[] words, String target) {

		int count = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(target)) {
				count++;
			}
		}

		String re[] = new String[words.length - count];

		for (int i = 0, j = 0; j < re.length; i++) {
			if (!(words[i].equals(target)))
				re[j++] = words[i];
		}

		return re;
	}

}
