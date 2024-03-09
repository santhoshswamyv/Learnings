package task3;

import java.util.Map;

public class MapAB3 {
	public static void main(String[] args) {
		MapAB3 s=new MapAB3();
		System.out.println(s.mapAB3(null));
	}
	public Map<String, String> mapAB3(Map<String, String> map) {
		  if(map.containsKey("a")||map.containsKey("b")){
		    if(map.containsKey("a")&&!(map.containsKey("b")))
		        map.put("b",map.get("a"));
		        
		    if(map.containsKey("b")&&!(map.containsKey("a")))
		        map.put("a",map.get("b"));
		  }
		  
		  return map;
		}

}
