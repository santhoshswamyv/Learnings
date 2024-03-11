package task3.ap1;

import java.util.ArrayList;
import java.util.List;

public class WordsWithoutList {
	public static void main(String[] args) {
		WordsWithoutList s = new WordsWithoutList();
		System.out.println(s.wordsWithoutList(args, 0));
	}

	public List<String> wordsWithoutList(String[] words, int len) {
		ArrayList<String> arr = new ArrayList<String>();
		for (String s : words) {
			if (s.length() != len)
				arr.add(s);
		}

		return arr;
	}

}
