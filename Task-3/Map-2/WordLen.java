package task3.map2;

import java.util.HashMap;
import java.util.Map;

public class WordLen {
	public static void main(String[] args) {
		WordLen s = new WordLen();
		System.out.println(s.wordLen(new String[] {}));
	}

	public Map<String, Integer> wordLen(String[] strings) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < strings.length; i++) {
			map.put(strings[i], strings[i].length());
		}

		return map;
	}

}
