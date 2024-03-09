package task3.map2;

import java.util.HashMap;
import java.util.Map;

public class Word0 {

	public static void main(String[] args) {
		Word0 s = new Word0();
		System.out.println(s.word0(new String[] {}));
	}

	public Map<String, Integer> word0(String[] strings) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < strings.length; i++) {
			if (!(map.containsKey(strings[i]))) {
				map.put(strings[i], 0);
			}
		}

		return map;
	}

}