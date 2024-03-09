package task3;

import java.util.Map;

public class MapShare {
	public static void main(String[] args) {
		MapShare s = new MapShare();
		System.out.println(s.mapShare(null));
	}

	public Map<String, String> mapShare(Map<String, String> map) {
		if (map.containsKey("a")) {
			map.put("b", map.get("a"));
		}

		map.remove("c");

		return map;
	}

}
