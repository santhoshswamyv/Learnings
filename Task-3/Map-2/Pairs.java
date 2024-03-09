package task3.map2;

import java.util.HashMap;
import java.util.Map;

public class Pairs {
	public static void main(String[] args) {
		Pairs s = new Pairs();
		System.out.println(s.pairs(args));
	}

	public Map<String, String> pairs(String[] strings) {
		Map<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < strings.length; i++) {
			map.put("" + strings[i].charAt(0), "" + strings[i].charAt(strings[i].length() - 1));
		}

		return map;
	}

}
