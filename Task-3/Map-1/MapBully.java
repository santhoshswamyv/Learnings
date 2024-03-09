package task3;

import java.util.Map;

public class MapBully {
	public static void main(String[] args) {
		MapBully s = new MapBully();
		System.out.println(s.mapBully(null));
	}

	public Map<String, String> mapBully(Map<String, String> map) {
		if (map.containsKey("a")) {
			map.put("b", map.get("a"));
			map.put("a", "");
		}
		return map;
	}

}
