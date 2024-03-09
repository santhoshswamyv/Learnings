package task3;

import java.util.Map;

public class MapAB {
	public static void main(String[] args) {
		MapAB s = new MapAB();
		System.out.println(s.mapAB(null));
	}

	public Map<String, String> mapAB(Map<String, String> map) {
		if (map.containsKey("a") && map.containsKey("b")) {
			map.put("ab", map.get("a") + map.get("b"));
		}

		return map;
	}

}
