package task3;

import java.util.Map;

public class MapAB2 {
	public static void main(String[] args) {
		MapAB2 s = new MapAB2();
		System.out.println(s.mapAB2(null));
	}

	public Map<String, String> mapAB2(Map<String, String> map) {
		if (map.containsKey("a") && map.containsKey("b") && map.get("a").equals(map.get("b"))) {
			map.remove("a");
			map.remove("b");
		}

		return map;
	}
}
