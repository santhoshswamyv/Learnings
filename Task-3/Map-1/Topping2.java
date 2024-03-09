package task3;

import java.util.Map;

public class Topping2 {
	public static void main(String[] args) {
		Topping2 s=new Topping2();
		System.out.println(s.topping2(null));
	}
	public Map<String, String> topping2(Map<String, String> map) {
		  if(map.containsKey("ice cream")){
		    map.put("yogurt",map.get("ice cream"));
		  }
		  
		  if(map.containsKey("spinach")){
		    map.put("spinach","nuts");
		  }
		  
		  return map;
		}

}
