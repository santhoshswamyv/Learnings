package task3.map2;

import java.util.HashMap;
import java.util.Map;

public class AllSwap {
	public static void main(String[] args) {
		AllSwap s = new AllSwap();
		System.out.println(s.allSwap(args));
	}

	public String[] allSwap(String[] strings) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < strings.length; i++) {
			char firstChar = strings[i].charAt(0);
			if (map.containsKey(firstChar)) {
				String temp = strings[i];
				strings[i] = strings[map.get(firstChar)];
				strings[map.get(firstChar)] = temp;
				map.remove(firstChar);
			} else {
				map.put(firstChar, i);
			}
		}
		return strings;
	}
}
