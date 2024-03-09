package task3;

import java.util.Map;

public class Topping1 {
	public static void main(String[] args) {
		Topping1 s = new Topping1();
		System.out.println(s.topping1(null));
	}

	public Map<String, String> topping1(Map<String, String> map) {
		if (map.containsKey("ice cream")) {
			map.put("ice cream", "cherry");
		}

		map.put("bread", "butter");

		return map;
	}

}
