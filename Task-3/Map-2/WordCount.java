package task3.map2;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
	public static void main(String[] args) {
		WordCount s = new WordCount();
		System.out.println(s.wordCount(args));
	}

	public Map<String, Integer> wordCount(String[] strings) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String s : strings) {
			if (map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
			} else {
				map.put(s, 1);
			}
		}
		return map;
	}

}
