package task3.map2;

import java.util.HashMap;
import java.util.Map;

public class FirstSwap {
	public static void main(String[] args) {
		FirstSwap s = new FirstSwap();
		System.out.println(s.firstSwap(args));
	}

	public String[] firstSwap(String[] strings) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < strings.length; i++) {
			char firstChar = strings[i].charAt(0);
			if (map.containsKey(firstChar) && map.get(firstChar) != -1) {
				String temp = strings[i];
				strings[i] = strings[map.get(firstChar)];
				strings[map.get(firstChar)] = temp;
				map.put(firstChar, -1);
			} else if (!map.containsKey(firstChar)) {
				map.put(firstChar, i);
			}
		}
		return strings;
	}
}
