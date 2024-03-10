package task3.ap1;

public class WordsCount {
	public static void main(String[] args) {
		WordsCount s = new WordsCount();
		System.out.println(s.wordsCount(args, 0));
	}

	public int wordsCount(String[] words, int len) {
		int count = 0;
		for (String n : words) {
			if (len == n.length())
				count++;
		}

		return count;
	}

}
