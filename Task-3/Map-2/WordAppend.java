package task3.map2;

import java.util.HashMap;
import java.util.Map;

public class WordAppend {
	public static void main(String[] args) {
		WordAppend s = new WordAppend();
		System.out.println(s.wordAppend(args));
	}

	public String wordAppend(String[] strings) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String result = "";
		for (String s : strings) {
			int count = map.getOrDefault(s, 0) + 1;
			map.put(s, count);
			if (count % 2 == 0) {
				result += s;
			}
		}
		return result;
	}

}
