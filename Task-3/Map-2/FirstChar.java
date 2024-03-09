package task3.map2;

import java.util.HashMap;
import java.util.Map;

public class FirstChar {
	public static void main(String[] args) {
		FirstChar s = new FirstChar();
		System.out.println(s.firstChar(args));
	}

	public Map<String, String> firstChar(String[] strings) {
		Map<String, String> map = new HashMap<>();
		for (String s : strings) {
			String firstChar = "" + s.charAt(0);
			if (map.containsKey(firstChar)) {
				map.put(firstChar, map.get(firstChar) + s);
			} else {
				map.put(firstChar, s);
			}
		}
		return map;
	}

}
